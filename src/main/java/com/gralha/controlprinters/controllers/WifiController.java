package com.gralha.controlprinters.controllers;

import com.gralha.controlprinters.domain.WifiModel;
import com.gralha.controlprinters.dtos.wifi.WifiDTO;
import com.gralha.controlprinters.dtos.wifi.WifiNewDTO;
import com.gralha.controlprinters.repositories.UserPrinterRepository;
import com.gralha.controlprinters.services.WifiService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/wifi")
public class WifiController {

    @Autowired
    private WifiService service;

    @Autowired
    private UserPrinterRepository repo;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        WifiModel obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> buscarTodos() {
        List<WifiModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<WifiModel> insert( @RequestBody WifiNewDTO obj) {
        WifiModel objNovo = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(objNovo.getId()).toUri();
        return ResponseEntity.created(uri).body(objNovo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<WifiModel> update(@Valid @RequestBody WifiDTO obj, @PathVariable Integer id) {
        obj.setId(id);
        WifiModel obj1 = service.atualiza(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
                path("/{id}").buildAndExpand(obj1.getId()).toUri();
        return ResponseEntity.created(uri).body(obj1);

    }
}
