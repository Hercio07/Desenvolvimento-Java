/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hospital;

import java.sql.Time;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Hospital {

    public static void main(String[] args) {
          Scanner in = new Scanner (System.in);
        System.out.println("1. Consulta marcada");
       
        System.out.println("2. Marcar Consulta");
        System.out.println("3. Informacoes do hospital");
        byte a = in.nextByte();
        switch (a){
            case 1:
         System.out.println("Digite o codigo atribuido");
         int codat1 = in.nextInt();break;
             
         
          // So imprime
           case 2:

            Paciente p1 = new Paciente();
            String nome = JOptionPane.showInputDialog("Introduza o nome: ");
            p1.inserirNome(nome);
            
            String idadeAux = JOptionPane.showInputDialog ("Introduza a idade: ");
            int idade = Integer.parseInt(idadeAux);
            p1.inserirIdade(idade);
            if (idade>10){
            System.out.println("Encaminhr para a pediatria");
            }
            String sexo = JOptionPane.showInputDialog("Sexo: ");
            
            p1.inserirSexo(sexo);
            String bairro = JOptionPane.showInputDialog("Qual e o seu bairro? ");
            
            p1.inserirBairro(bairro);
            String quarteiraoaux = JOptionPane.showInputDialog("Introduza o No do seu quarteirao: ");
            int quarteirao = Integer.parseInt(quarteiraoaux);
            
            String casaaux = JOptionPane.showInputDialog("Introduza o No da sua casa: ");
            int ncasa = Integer.parseInt(casaaux);
            p1.inserirNcasa(ncasa);
            
            String contactoaux = JOptionPane.showInputDialog("Introduza o seu contacto: ");
            int contacto = Integer.parseInt(contactoaux);
            p1.inserirContacto(contacto);
            
            String preocupacao = JOptionPane.showInputDialog("O que voce sente: ");
            p1.inserirPreocupacao(preocupacao);
            
            System.out.println("Nome: "+p1.retornarNome());
            System.out.println("Idade: "+p1.retornarIdade());     
            System.out.println("sexo: "+p1.retornarSexo());     
            System.out.println("bairro: "+p1.retornarBairro()); 
            System.out.println("quarteirao: "+p1.retornarQuarteirao());
            System.out.println("numero da casa: "+p1.retorarNcasa());
            System.out.println("contacto: "+p1.retornarContacto());
            double ale = Math.random();
            int codat = (int) (1 + ale * (10000-1));
            System.out.println("O seu codigo e "+codat);break;
            
           case 3:
            System.out.println("Hospital Central de Maputo");
            System.out.println("O que deseja saber?");
            System.out.println("1.Informacoes gerais");
            System.out.println("2.Pediatria");
            System.out.println(Time.UTC(2022, 10, 13, 12, 51, 30));
            int info=0;
            switch(info){
                case 1:
                    System.out.println("Foi fundado em ");
                    System.out.println("Bla bla bla");break;
                case 2:
                    System.out.println("");
                   
            }
            
            
            
            
            
          
                    
                    
                
            
           
            
        }
    }
}
