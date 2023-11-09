package com.gralha.controlprinters.repositories.query;

import com.gralha.controlprinters.domain.UserPrinterModel;
import com.gralha.controlprinters.repositories.filter.UserPrinterFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserPrinterRepositoryQuery {
    public Page<UserPrinterModel> filtrar(UserPrinterFilter Pacientefilter, Pageable pageable);
}
