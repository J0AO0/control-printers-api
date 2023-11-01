package com.gralha.controlprinters.controllers;

import com.gralha.controlprinters.dtos.ComputerDTO;
import com.gralha.controlprinters.dtos.ComputerNewDTO;
import com.gralha.controlprinters.models.ComputerModel;
import com.gralha.controlprinters.services.ComputerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/computadores")
public class ComputerController {

    @Autowired
    private ComputerService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        ComputerModel obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarTodos() {
        List<ComputerModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ComputerModel> insert( @RequestBody ComputerNewDTO obj) {
        ComputerModel objNovo = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(objNovo.getId()).toUri();
        return ResponseEntity.created(uri).body(objNovo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ComputerModel> update(@Valid @RequestBody ComputerDTO obj, @PathVariable Integer id) {
        obj.setId(id);
        ComputerModel obj1 = service.atualiza(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(obj1.getId()).toUri();
        return ResponseEntity.created(uri).body(obj1);

    }

}
