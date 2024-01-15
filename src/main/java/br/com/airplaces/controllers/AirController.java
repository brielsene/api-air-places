package br.com.airplaces.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/air")
public class AirController {
    @GetMapping
    public String hello(){
        return "Hello";
    }
}
