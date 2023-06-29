/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO ("M", "Masculino"),
    FEMININO ("F", "Feminino");
    
    protected final String caractere;
    protected final String texto;

    private Genero(String caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public String getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
