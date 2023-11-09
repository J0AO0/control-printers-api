package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.domain.ComputerModel;
import com.gralha.controlprinters.repositories.query.ComputerRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<ComputerModel, Integer>, ComputerRepositoryQuery {
    @Query(value= "select * from TB_COMPUTADORES", nativeQuery = true)
    List<ComputerModel> buscarTodos();

    @Query(value= "select * from TB_COMPUTADORES where id = ?", nativeQuery = true)
    ComputerModel buscarPorId(Integer id);
}
