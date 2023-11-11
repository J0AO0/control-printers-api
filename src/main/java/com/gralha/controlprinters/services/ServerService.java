package com.gralha.controlprinters.services;

import com.gralha.controlprinters.domain.ServerModel;
import com.gralha.controlprinters.dtos.server.ServerDTO;
import com.gralha.controlprinters.dtos.server.ServerNewDTO;
import com.gralha.controlprinters.repositories.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {

    @Autowired
        private ServerRepository repo;

        public ServerModel find(Integer id) {
            ServerModel r = repo.buscarPorId(id);
            return r;

        }
        public List<ServerModel> findAll() {
            List<ServerModel> list = repo.buscarTodos();
            return list;
        }
        public ServerModel insert(ServerNewDTO obj) {
            ServerModel resEst = new  ServerModel(obj);
            return repo.save(resEst);
        }

        public ServerModel atualiza(ServerDTO obj) {
            ServerModel resEst =  repo.buscarPorId(obj.getId());
            resEst.setIp(obj.getIp());
            resEst.setEmpresa(obj.getEmpresa());
            resEst.setSo(obj.getSo());

            return repo.save(resEst);
        }

        public void delete (Integer id) {
            repo.deleteById(id);
        }
}
