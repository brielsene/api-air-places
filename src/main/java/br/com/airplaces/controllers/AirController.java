package br.com.airplaces.controllers;

import br.com.airplaces.domain.dtos.AeroportoRequestDTO;
import br.com.airplaces.domain.models.Aeroporto;
import br.com.airplaces.services.AeroportoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/air")
public class AirController {

    @Autowired
    private AeroportoService aeroportoService;
    @PostMapping
    public ResponseEntity registraAeroporto(@RequestBody AeroportoRequestDTO aeroportoRequestDTO){
        aeroportoService.registraAeroporto(aeroportoRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
