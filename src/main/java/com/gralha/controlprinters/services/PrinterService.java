package com.gralha.controlprinters.services;

import com.gralha.controlprinters.dtos.printer.PrinterDTO;
import com.gralha.controlprinters.dtos.printer.PrinterNewDTO;
import com.gralha.controlprinters.domain.PrintersModel;
import com.gralha.controlprinters.repositories.PrintersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterService {
    @Autowired
    private PrintersRepository repo;

    public PrintersModel find(Integer id) {
        PrintersModel r = repo.buscarPorId(id);
        return r;

    }
    public List<PrintersModel> findAll() {
        List<PrintersModel> list = repo.buscarTodos();
        return list;
    }
    public PrintersModel insert(PrinterNewDTO obj) {
        PrintersModel resEst = new  PrintersModel(obj);
        return repo.save(resEst);
    }

    public PrintersModel atualiza(PrinterDTO obj) {
        PrintersModel resEst =  repo.buscarPorId(obj.getId());
        resEst.setCodigo(obj.getCodigo());
        resEst.setIp(obj.getIp());
        resEst.setSetor(obj.getSetor());
        resEst.setStatus(obj.getStatus());
        resEst.setToner(obj.getToner());
        resEst.setEmpresa(obj.getEmpresa());
        resEst.setFornToner(obj.getFornToner());

        return repo.save(resEst);
    }

    public void delete (Integer id) {
        repo.deleteById(id);
    }
}
