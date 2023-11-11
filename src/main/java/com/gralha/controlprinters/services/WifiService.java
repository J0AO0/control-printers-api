package com.gralha.controlprinters.services;

import com.gralha.controlprinters.domain.WifiModel;
import com.gralha.controlprinters.dtos.wifi.WifiDTO;
import com.gralha.controlprinters.dtos.wifi.WifiNewDTO;
import com.gralha.controlprinters.repositories.WifiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WifiService {
    @Autowired
    private WifiRepository repo;

    public WifiModel find(Integer id) {
        WifiModel r = repo.buscarPorId(id);
        return r;

    }
    public List<WifiModel> findAll() {
        List<WifiModel> list = repo.buscarTodos();
        return list;
    }
    public WifiModel insert(WifiNewDTO obj) {
        WifiModel resEst = new  WifiModel(obj);

        return repo.save(resEst);
    }
    public WifiModel atualiza(WifiDTO obj) {
        WifiModel resEst =  repo.buscarPorId(obj.getId());
        resEst.setNome(obj.getNome());
        resEst.setSenha(obj.getSenha());
        resEst.setEmpresa(obj.getEmpresa());
        resEst.setEquipamento(obj.getEquipamento());

        return repo.save(resEst);
    }
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
