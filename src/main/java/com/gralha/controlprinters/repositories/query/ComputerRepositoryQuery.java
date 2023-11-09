package com.gralha.controlprinters.repositories.query;

import com.gralha.controlprinters.domain.ComputerModel;
import com.gralha.controlprinters.repositories.filter.ComputerFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ComputerRepositoryQuery {
    public Page<ComputerModel> filtrar(ComputerFilter Pacientefilter, Pageable pageable);
}
