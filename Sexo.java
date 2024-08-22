/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    
    MASCULINO ("Masculino", 'M'), FEMININO ("Feminino", 'F');
    
    private String texto;
    private char sigla;

    private Sexo(String texto, char sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }
    
    
    
}
