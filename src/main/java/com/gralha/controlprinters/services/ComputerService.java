package com.gralha.controlprinters.services;


import com.gralha.controlprinters.dtos.ComputerDTO;
import com.gralha.controlprinters.dtos.ComputerNewDTO;
import com.gralha.controlprinters.domain.ComputerModel;
import com.gralha.controlprinters.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    private ComputerRepository repo;

    public ComputerModel find(Integer id) {
        ComputerModel r = repo.buscarPorId(id);
        return r;

    }
    public List<ComputerModel> findAll() {
        List<ComputerModel> list = repo.buscarTodos();
        return list;
    }
    public ComputerModel insert(ComputerNewDTO obj) {
        ComputerModel resEst = new  ComputerModel(obj);
        return repo.save(resEst);
    }

    public ComputerModel atualiza(ComputerDTO obj) {
        ComputerModel resEst =  repo.buscarPorId(obj.getId());
        resEst.setSetor(obj.getSetor());
        resEst.setComputador(obj.getComputador());
        resEst.setUsuario(obj.getUsuario());
        resEst.setSo(obj.getSo());
        resEst.setIp(obj.getIp());
        resEst.setEmpresa(obj.getEmpresa());

        return repo.save(resEst);
    }

    public void delete (Integer id) {
        repo.deleteById(id);
    }
}
