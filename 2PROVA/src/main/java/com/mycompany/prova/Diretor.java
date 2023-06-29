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
public class Diretor extends CargoDeConfiança implements Contratacao{
    private double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
    }

   

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalariFinal() {
    double salarioFinal = 0;
    salarioFinal += super.getSalario() * this.PREMIO;
    salarioFinal += super.getSalario();
    return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
               " Diretor{" + "PREMIO=" + PREMIO + '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Você está admitido!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Você está demitido!");
    }
    

    
    
}
