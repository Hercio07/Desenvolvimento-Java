/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

/**
 *
 * @author Dell
 */
public class Paciente {
    private String nome, sexo,bairro,preocupacao ;
    private int idade, quarteirao,ncasa, contacto;
    
    
    public void inserirIdade(int idade){
        this.idade=idade;
    }
    public void inserirNome(String nome){
        this.nome = nome;}
    
    public void inserirSexo(String sexp){
        this.sexo=sexo;}
    
    public void inserirContacto(int contacto){
        this.contacto = contacto;
    }
    public void inserirBairro(String bairro){
        this.bairro= bairro;     
    }
    public void inserirQuarteirao(int quarteirao){
        this.quarteirao = quarteirao;
    }
    public void inserirPreocupacao(String preocupacao){
        this.preocupacao = preocupacao;
    }
    public void inserirNcasa(int ncasa){
        this.ncasa = ncasa;
    }
    public int retornarIdade(){
    return idade;}
    public int retornarNcasa(){
        return ncasa;
    }
    public String retornarNome(){
    return nome;}
    
    public String retornarSexo(){
    return sexo;} 
    
    public int retornarContacto(){
    return contacto;
    }
    public String retornarBairro(){
        return bairro;
    }
    public int retornarQuarteirao(){
        return quarteirao;
    }
    public String retornarPreocupacao(){
        return preocupacao;
    }
    public int retorarNcasa(){
        return ncasa;
    }
}
