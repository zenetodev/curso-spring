package com.example.spring_matheus.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    
    public String obterMensagem(){
        return "Olá do repositório!";
    }
}
