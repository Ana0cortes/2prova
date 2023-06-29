/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("555558", "jonh", "754555858", "514626", Setor.OPERECOES, Genero.MASCULINO,  8554, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.MARCH, 4, new Endereco("kampç", "855", "casa", "4052558", "Mirante", UnidadeFederativa.BAHIA)));
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "ana", "88552526544", "554155", Setor.RECURSOS_HUMANOS, Genero.FEMININO, 85000, EstadoCivil.CASADO, LocalDate.of(1990, Month.MARCH, 4, new Endereco("ndxnb", "142", "17 andar", "44552", "londrina", UnidadeFederativa.SAO_PAULO)));
        
        Engenheiro engenheiro = new Engenheiro("8855525", "julia", "885524488", "616516", Setor.ENGENHARIA, Genero.FEMININO, 20000, EstadoCivil.CASADO, LocalDate.of(1995, Month.MARCH, 4, new Endereco("Ghbaida", "458", "5 andar", "85545", "Marialu", UnidadeFederativa.RIO_DE_JANEIRO)));
       
        
        System.out.println("------- Construção--------");
        
        diretor.admitir(engenheiro);
                
        System.out.println("");
        
        
        diretor.demitir(motoboy);
        
    }
   
}
