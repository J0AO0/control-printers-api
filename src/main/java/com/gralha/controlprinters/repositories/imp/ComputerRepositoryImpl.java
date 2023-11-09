package com.gralha.controlprinters.repositories.imp;

import com.gralha.controlprinters.domain.ComputerModel;
import com.gralha.controlprinters.repositories.filter.ComputerFilter;
import com.gralha.controlprinters.repositories.query.ComputerRepositoryQuery;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;

public class ComputerRepositoryImpl implements ComputerRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<ComputerModel> filtrar(ComputerFilter computerfilter, Pageable pageable) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<ComputerModel> criteria = builder.createQuery(ComputerModel.class);
        Root<ComputerModel> root = criteria.from(ComputerModel.class);
        criteria.distinct(true);
        List<Order> orderList = new ArrayList<>();
        orderList.add(builder.desc(root.get("id")));
        criteria.orderBy(orderList);
        Predicate[] predicates = criarRestricoes(computerfilter, builder, root);
        criteria.where(predicates);
        TypedQuery<ComputerModel> query = manager.createQuery(criteria);
        List<ComputerModel> listacarga = new ArrayList<>();
        listacarga = query.getResultList();
        adicionarRestricoesDePaginacao(query, pageable);
        return new PageImpl<>(query.getResultList(), pageable, listacarga.size());

    }

    private Predicate[] criarRestricoes(ComputerFilter computerfilter, CriteriaBuilder builder, Root<ComputerModel> root) {
        List<Predicate> predicates = new ArrayList<>();
//		private String id;
//		private String nome;

        if (computerfilter.getSetor() != null) {
            predicates.add(builder.like(builder.lower(root.get("setor")), "%" + computerfilter.getSetor() + "%"));
        }
        if (computerfilter.getComputador() != null) {
            predicates.add(builder.like(builder.lower(root.get("computador")), "%" + computerfilter.getComputador() + "%"));
        }
        if (computerfilter.getUsuario() != null) {
            predicates.add(builder.like(builder.lower(root.get("usuario")), "%" + computerfilter.getUsuario() + "%"));
        }
        if (computerfilter.getSo() != null) {
            predicates.add(builder.like(builder.lower(root.get("so")), "%" + computerfilter.getSo() + "%"));
        }
        if (computerfilter.getIp() != null) {
            predicates.add(builder.like(builder.lower(root.get("ip")), "%" + computerfilter.getIp() + "%"));
        }
        if (computerfilter.getEmpresa() != null) {
            predicates.add(builder.like(builder.lower(root.get("usuario")), "%" + computerfilter.getEmpresa() + "%"));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

    private void adicionarRestricoesDePaginacao(TypedQuery<ComputerModel> query, Pageable pageable) {

        int paginaAtual = pageable.getPageNumber();

        int totalRegistrosPorPagina = pageable.getPageSize();

        int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;
        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistrosPorPagina);

    }

}
