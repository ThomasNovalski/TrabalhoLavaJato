/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;

/**
 *
 * @author thoma
 */
public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String sexo;
    private String telefone;
    private String nascimento;
    private String endereco;
    
   

    // Construtor
    public Cliente(String nome, String sobrenome, String sexo, String telefone, String nascimento, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.endereco = endereco;
            
        
    }
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return nascimento;
    }

    public String getEndereco() {
        return endereco;
    }
}

   

