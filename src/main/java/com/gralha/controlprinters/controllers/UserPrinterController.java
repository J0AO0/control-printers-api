package com.gralha.controlprinters.controllers;

import com.gralha.controlprinters.dtos.UserPrinterDTO;
import com.gralha.controlprinters.dtos.UserPrinterNewDTO;
import com.gralha.controlprinters.models.UserPrinterModel;
import com.gralha.controlprinters.services.UserPrinterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value="/usuarioimp")
public class UserPrinterController {

    @Autowired
    private UserPrinterService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        UserPrinterModel obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarTodos() {
        List<UserPrinterModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserPrinterModel> insert( @RequestBody UserPrinterNewDTO obj) {
        UserPrinterModel objNovo = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(objNovo.getId()).toUri();
        return ResponseEntity.created(uri).body(objNovo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<UserPrinterModel> update(@Valid @RequestBody UserPrinterDTO obj, @PathVariable Integer id) {
        obj.setId(id);
        UserPrinterModel obj1 = service.atualiza(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(obj1.getId()).toUri();
        return ResponseEntity.created(uri).body(obj1);

    }

}
