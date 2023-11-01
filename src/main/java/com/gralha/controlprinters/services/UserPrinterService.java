package com.gralha.controlprinters.services;

import com.gralha.controlprinters.dtos.UserPrinterDTO;
import com.gralha.controlprinters.dtos.UserPrinterNewDTO;
import com.gralha.controlprinters.models.UserPrinterModel;
import com.gralha.controlprinters.repositories.UserPrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserPrinterService {

    @Autowired
    private UserPrinterRepository repo;

    public UserPrinterModel find(Integer id) {
        UserPrinterModel r = repo.buscarPorId(id);
        return r;

    }
    public List<UserPrinterModel> findAll() {
        List<UserPrinterModel> list = repo.buscarTodos();
        return list;
    }
    public UserPrinterModel insert(UserPrinterNewDTO obj) {
        UserPrinterModel resEst = new  UserPrinterModel(obj);

        return repo.save(resEst);
    }
    public UserPrinterModel atualiza(UserPrinterDTO obj) {
        UserPrinterModel resEst = new  UserPrinterModel(obj);
        return repo.save(resEst);
    }
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
