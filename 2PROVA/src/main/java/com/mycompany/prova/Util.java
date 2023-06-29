/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Aluno
 */
public class Util {
    
    
    
    
    public static String formataData(LocalDate data){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return formatar.format(data);
    }
    public static String formataSalario(double valor){
       NumberFormat formatar = NumberFormat.getCompactNumberInstance();
       return formatar.format(valor);
        
      }   
        
    }    
       
   

