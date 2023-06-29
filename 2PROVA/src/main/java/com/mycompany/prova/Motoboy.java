/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    public String getCarteiraDeTrabalho() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeHabilitacao = carteiraDeTrabalho;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Carteira de Habilitação: " + carteiraDeHabilitacao + '}';
    }

    @Override
    public double getSalariFinal() {
      double SalarioFinal = 0;
    return SalarioFinal;
    }
    
    
}
