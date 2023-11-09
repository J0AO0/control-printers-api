package com.gralha.controlprinters.repositories.imp;

import com.gralha.controlprinters.domain.UserPrinterModel;
import com.gralha.controlprinters.repositories.filter.UserPrinterFilter;
import com.gralha.controlprinters.repositories.query.UserPrinterRepositoryQuery;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class UserPrinterRepositoryImpl implements UserPrinterRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<UserPrinterModel> filtrar(UserPrinterFilter userPrinterfilter, Pageable pageable) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<UserPrinterModel> criteria = builder.createQuery(UserPrinterModel.class);
        Root<UserPrinterModel> root = criteria.from(UserPrinterModel.class);
        criteria.distinct(true);
        List<Order> orderList = new ArrayList<>();
        orderList.add(builder.desc(root.get("id")));
        criteria.orderBy(orderList);
        Predicate[] predicates = criarRestricoes(userPrinterfilter, builder, root);
        criteria.where(predicates);
        TypedQuery<UserPrinterModel> query = manager.createQuery(criteria);
        List<UserPrinterModel> listacarga = new ArrayList<>();
        listacarga = query.getResultList();
        adicionarRestricoesDePaginacao(query, pageable);
        return new PageImpl<>(query.getResultList(), pageable, listacarga.size());

    }

    private Predicate[] criarRestricoes(UserPrinterFilter userPrinterfilter, CriteriaBuilder builder, Root<UserPrinterModel> root) {
        List<Predicate> predicates = new ArrayList<>();
//		private String id;
//		private String nome;

        if (userPrinterfilter.getNome() != null) {
            predicates.add(builder.like(builder.lower(root.get("nome")), "%" + userPrinterfilter.getNome() + "%"));
        }
        if (userPrinterfilter.getEmail() != null) {
            predicates.add(builder.like(builder.lower(root.get("email")), "%" + userPrinterfilter.getEmail() + "%"));
        }
        if (userPrinterfilter.getSenha() != null) {
            predicates.add(builder.like(builder.lower(root.get("usuario")), "%" + userPrinterfilter.getSenha() + "%"));
        }


        return predicates.toArray(new Predicate[predicates.size()]);
    }

    private void adicionarRestricoesDePaginacao(TypedQuery<UserPrinterModel> query, Pageable pageable) {

        int paginaAtual = pageable.getPageNumber();

        int totalRegistrosPorPagina = pageable.getPageSize();

        int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;
        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistrosPorPagina);

    }

}

