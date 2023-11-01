package com.gralha.controlprinters.controllers;

import com.gralha.controlprinters.dtos.PrinterDTO;
import com.gralha.controlprinters.dtos.PrinterNewDTO;
import com.gralha.controlprinters.dtos.SupportDTO;
import com.gralha.controlprinters.dtos.SupportNewDTO;

import com.gralha.controlprinters.models.SupportModel;

import com.gralha.controlprinters.services.SupportService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/manutencao")
public class SupportController {
    @Autowired
    private SupportService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        SupportModel obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarTodos() {
        List<SupportModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<SupportModel> insert( @RequestBody SupportNewDTO obj) {
        SupportModel objNovo = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(objNovo.getId()).toUri();
        return ResponseEntity.created(uri).body(objNovo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<SupportModel> update(@Valid @RequestBody SupportDTO obj, @PathVariable Integer id) {
        obj.setId(id);
        SupportModel obj1 = service.atualiza(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(obj1.getId()).toUri();
        return ResponseEntity.created(uri).body(obj1);

    }
}
