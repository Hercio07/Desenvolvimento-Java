/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.*;

public class Banco implements Imprimivel {

    ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void inserir(ContaBancaria conta) {
        contas.add(conta);
    }

    public void remover(ContaBancaria conta) {
        contas.remove(conta);
    }

    public ContaBancaria procurarConta(int numConta) {

        ContaBancaria conta = null;

        for (int i = 0; i <= contas.size(); i++) {

            if (numConta == contas.get(i).getNumConta()) {
                conta = contas.get(i);
            }

        }

        return conta;
    }
    
    public void mostrarDados(){
        for(int i = 0; i <= contas.size(); i++){
            System.out.println("Numero da conta: "+contas.get(i).getNumConta());
            System.out.println("Saldo: "+contas.get(i).getSaldo());
            System.out.println();
        }
    }
}
