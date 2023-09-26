/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;

/**
 *
 * @author thoma
 */
public class Veiculo {
    
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private String lavagem[] = new String[4];
    private String plano;
    // Construtor
public Veiculo(String marca, String modelo, int ano, String cor, String placa,String plano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.lavagem = lavagem;
        this.plano = plano;
    }
 public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }
    
    public String getPlano() {
        return plano;
    }
    public String getLavagem1() {
        return lavagem[0];
    }
    public String getLavagem2() {
        return lavagem[1];
    }
     public String getLavagem3() {
        return lavagem[2];
    }
      public String getLavagem4() {
        return lavagem[3];
    }
    
    public void setLavagem1(String lavagem){
       this.lavagem[0] = lavagem;
    }
    public void setLavagem2(String lavagem){
       this.lavagem[1]= lavagem;
    }
    public void setLavagem3(String lavagem){
       this.lavagem[2]= lavagem;
    }
    public void setLavagem4(String lavagem){
       this.lavagem[3]= lavagem;
    }
}

