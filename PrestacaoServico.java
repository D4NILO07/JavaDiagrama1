/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio;

/**
 *
 * @author Aluno
 */
public class PrestacaoServico extends Juridica{
    
    protected String contratoInicio;
    protected String contratoFim;

    public PrestacaoServico(String contratoInicio, String contratoFim, String cnpj, String incricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, incricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(String contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(String contratoFim) {
        this.contratoFim = contratoFim;
    }
    
    

    
    
    
    
}
