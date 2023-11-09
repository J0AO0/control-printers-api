package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.domain.PrintersModel;
import com.gralha.controlprinters.domain.ServerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ServerRepository extends JpaRepository<ServerModel, Integer> {
    @Query(value= "select * from TB_SERVER", nativeQuery = true)
    List<ServerModel> buscarTodos();

    @Query(value= "select * from TB_SERVER where id = ?", nativeQuery = true)
    ServerModel buscarPorId(Integer id);
}
