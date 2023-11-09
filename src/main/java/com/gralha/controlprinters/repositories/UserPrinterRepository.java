package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.domain.UserPrinterModel;
import com.gralha.controlprinters.repositories.query.UserPrinterRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPrinterRepository extends JpaRepository <UserPrinterModel, Integer>, UserPrinterRepositoryQuery {
    @Query(value= "select * from TB_USUARIOS", nativeQuery = true)
    List<UserPrinterModel> buscarTodos();

    @Query(value= "select * from TB_USUARIOS where id = ?", nativeQuery = true)
    UserPrinterModel buscarPorId(Integer id);
}
