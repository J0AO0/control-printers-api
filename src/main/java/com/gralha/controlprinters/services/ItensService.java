package com.gralha.controlprinters.services;

import com.gralha.controlprinters.domain.ComputerModel;
import com.gralha.controlprinters.domain.ItensModel;
import com.gralha.controlprinters.dtos.computer.ComputerDTO;
import com.gralha.controlprinters.dtos.computer.ComputerNewDTO;
import com.gralha.controlprinters.dtos.itens.ItensDTO;
import com.gralha.controlprinters.dtos.itens.ItensNewDTO;
import com.gralha.controlprinters.repositories.ComputerRepository;
import com.gralha.controlprinters.repositories.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItensService {
    @Autowired
    private ItensRepository repo;

    public ItensModel find(Integer id) {
        ItensModel r = repo.buscarPorId(id);
        return r;

    }
    public List<ItensModel> findAll() {
        List<ItensModel> list = repo.buscarTodos();
        return list;
    }
    public ItensModel insert(ItensNewDTO obj) {
        ItensModel resEst = new  ItensModel(obj);
        return repo.save(resEst);
    }

    public ItensModel atualiza(ItensDTO obj) {
        ItensModel resEst =  repo.buscarPorId(obj.getId());
        resEst.setFornecedor(obj.getFornecedor());
        resEst.setNome(obj.getNome());
        resEst.setMarca(obj.getMarca());
        resEst.setQuantidade(obj.getQuantidade());
        resEst.setStatus(obj.getStatus());

        return repo.save(resEst);
    }

    public void delete (Integer id) {
        repo.deleteById(id);
    }
}
