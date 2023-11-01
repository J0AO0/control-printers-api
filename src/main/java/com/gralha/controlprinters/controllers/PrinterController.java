package com.gralha.controlprinters.controllers;

import com.gralha.controlprinters.dtos.PrinterDTO;
import com.gralha.controlprinters.dtos.PrinterNewDTO;
import com.gralha.controlprinters.models.PrintersModel;
import com.gralha.controlprinters.services.PrinterService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value="/impressoras")
public class PrinterController {

    @Autowired
    private PrinterService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        PrintersModel obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarTodos() {
        List<PrintersModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<PrintersModel> insert( @RequestBody PrinterNewDTO obj) {
        PrintersModel objNovo = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(objNovo.getId()).toUri();
        return ResponseEntity.created(uri).body(objNovo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<PrintersModel> update(@Valid @RequestBody PrinterDTO obj, @PathVariable Integer id) {
        obj.setId(id);
        PrintersModel obj1 = service.atualiza(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(obj1.getId()).toUri();
        return ResponseEntity.created(uri).body(obj1);

    }
}
