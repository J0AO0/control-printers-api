package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.domain.ServerModel;
import com.gralha.controlprinters.domain.WifiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WifiRepository extends JpaRepository<WifiModel, Integer> {
    @Query(value= "select * from TB_WIFI", nativeQuery = true)
    List<WifiModel> buscarTodos();

    @Query(value= "select * from TB_WIFI where id = ?", nativeQuery = true)
    WifiModel buscarPorId(Integer id);
}
