/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA (" Engenharia"),
    SAUDE (" Saude"),
    JURIDICO (" Juridico"),
    RECURSOS_HUMANOS (" RH"),
    MARKETING ("Marketing"),
    OPERECOES ("Operações");
    
    protected final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}
