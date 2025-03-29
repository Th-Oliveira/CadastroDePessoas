package com.thiago.CadastroDePessoas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroDePessoasController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Bem vindo ao cadastro de pessoas";
    }
}