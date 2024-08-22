/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio;

/**
 *
 * @author Aluno
 */
public class Main2 {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Rua das Bananeiras",
                "34",
                "1º Andar",
                "40717-470",
                "Salvador", 
                UnidadeFederativa.BAHIA);
        
        Cliente cliente = new Cliente("123.456",
                Sexo.MASCULINO,
                EstadoCivil.SOLTEIRO,
                "09/05/2007",
                "Danilo",
                "71 99359-2306",
                "DaniloalmeidapaulO@gmail.com", endereco);
        
        PrestacaoServico prestacaoServico = new PrestacaoServico("04/03/2023",
                "04/03/2025", "13.4546.879",
                "213549",
                "Danilo",
                "7199359-2306",
                "daniloalmeidapaulo@gmail.com", endereco);
        
        System.out.println("\nDados Pessoa Fisica: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Sexo: " + cliente.sexo.getTexto());
        System.out.println("Estado Civil: " + cliente.estadoCivil.getTexto());
        System.out.println("\nENDEREÇO");
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Unidade Federativa: " + endereco.getUf().getNome());

        System.out.println("\n\nDados Pessoa Juridica: ");
        System.out.println("Nome: " + prestacaoServico.getNome());
        System.out.println("CNPJ: " + prestacaoServico.getCnpj());
        System.out.println("Telefone: " + prestacaoServico.getTelefone());
        System.out.println("Email: " + prestacaoServico.getEmail());
        
        
    }
}
