package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.domain.ItensModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItensRepository extends JpaRepository<ItensModel, Integer> {

    @Query(value= "select * from TB_ITENS", nativeQuery = true)
    List<ItensModel> buscarTodos();

    @Query(value= "select * from TB_ITENS where id = ?", nativeQuery = true)
    ItensModel buscarPorId(Integer id);

}
