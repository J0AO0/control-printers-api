package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.domain.PrintersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PrintersRepository extends JpaRepository<PrintersModel, Integer> {
    @Query(value= "select * from TB_IMPRESSORAS", nativeQuery = true)
    List<PrintersModel> buscarTodos();

    @Query(value= "select * from TB_IMPRESSORAS where id = ?", nativeQuery = true)
    PrintersModel buscarPorId(Integer id);
}
