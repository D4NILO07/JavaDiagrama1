/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica {
    
    protected String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "protocoloAtendimento=" + protocoloAtendimento + '}';
    }

    
    

   

   
    
}
