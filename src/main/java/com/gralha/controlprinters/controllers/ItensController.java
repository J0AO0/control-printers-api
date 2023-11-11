package com.gralha.controlprinters.controllers;

import com.gralha.controlprinters.domain.ComputerModel;
import com.gralha.controlprinters.domain.ItensModel;
import com.gralha.controlprinters.dtos.computer.ComputerDTO;
import com.gralha.controlprinters.dtos.computer.ComputerNewDTO;
import com.gralha.controlprinters.dtos.itens.ItensDTO;
import com.gralha.controlprinters.dtos.itens.ItensNewDTO;
import com.gralha.controlprinters.repositories.ComputerRepository;
import com.gralha.controlprinters.repositories.ItensRepository;
import com.gralha.controlprinters.repositories.filter.ComputerFilter;
import com.gralha.controlprinters.services.ComputerService;
import com.gralha.controlprinters.services.ItensService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItensController {

    @Autowired
    private ItensService service;

    @Autowired
    private ItensRepository repo;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        ItensModel obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarTodos() {
        List<ItensModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ItensModel> insert( @RequestBody ItensNewDTO obj) {
        ItensModel objNovo = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(objNovo.getId()).toUri();
        return ResponseEntity.created(uri).body(objNovo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ItensModel> update(@Valid @RequestBody ItensDTO obj, @PathVariable Integer id) {
        obj.setId(id);
        ItensModel obj1 = service.atualiza(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(obj1.getId()).toUri();
        return ResponseEntity.created(uri).body(obj1);

    }
}
