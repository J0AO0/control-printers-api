package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.domain.SupportModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupportRepository extends JpaRepository<SupportModel, Integer> {

    @Query(value= "select * from TB_MANUTENCAO", nativeQuery = true)
    List<SupportModel> buscarTodos();

    @Query(value= "select * from TB_MANUTENCAO where id = ?", nativeQuery = true)
    SupportModel buscarPorId(Integer id);

}
