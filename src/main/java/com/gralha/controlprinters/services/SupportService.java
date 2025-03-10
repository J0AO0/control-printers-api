package com.gralha.controlprinters.services;

import com.gralha.controlprinters.dtos.support.SupportDTO;
import com.gralha.controlprinters.dtos.support.SupportNewDTO;
import com.gralha.controlprinters.domain.SupportModel;
import com.gralha.controlprinters.repositories.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportService {
    @Autowired
    private SupportRepository repo;

    public SupportModel find(Integer id) {
        SupportModel r = repo.buscarPorId(id);
        return r;

    }
    public List<SupportModel> findAll() {
        List<SupportModel> list = repo.buscarTodos();
        return list;
    }
    public SupportModel insert(SupportNewDTO obj) {
        SupportModel resEst = new  SupportModel(obj);
        return repo.save(resEst);
    }

    public SupportModel atualiza(SupportDTO obj) {
        SupportModel resEst =  repo.buscarPorId(obj.getId());
        resEst.setIdaManutencao(obj.getIdaManutencao());
        resEst.setVoltaManutencao(obj.getVoltaManutencao());
        resEst.setId(obj.getId());
        resEst.setPrinters(obj.getPrinters());
        resEst.setContadorAtual(obj.getContadorAtual());
        resEst.setContadorInicial(obj.getContadorInicial());
        resEst.setObs(obj.getObs());

        return repo.save(resEst);
    }

    public void delete (Integer id) {
        repo.deleteById(id);
    }
}
