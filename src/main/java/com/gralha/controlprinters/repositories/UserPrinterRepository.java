package com.gralha.controlprinters.repositories;

import com.gralha.controlprinters.models.PrintersModel;
import com.gralha.controlprinters.models.UserPrinterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserPrinterRepository extends JpaRepository <UserPrinterModel, Integer>{
    @Query(value= "select * from TB_USUARIOS", nativeQuery = true)
    List<UserPrinterModel> buscarTodos();

    @Query(value= "select * from TB_USUARIOS where id = ?", nativeQuery = true)
    UserPrinterModel buscarPorId(Integer id);
}
