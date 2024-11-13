/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {

        Banco banco = new Banco();

        Scanner scan = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("=========Menu=========");
            System.out.println("1.Criar Conta");
            System.out.println("2.Selecionar Conta");
            System.out.println("3.Remover Conta");
            System.out.println("4.Gerar Relatorio");
            System.out.println("5.Finalizar");

            System.out.println("Selecione uma opcao");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("1.Conta Corrente");
                    System.out.println("2.Conta Poupanca");
                    System.out.println("Selecione o tipo de conta");
                    int escolha = scan.nextInt();
                    if (escolha == 1) {
                        System.out.println("Insira numero da conta");
                        int numConta = scan.nextInt();

                        System.out.println("Insira o saldo da conta");
                        double saldo = scan.nextDouble();

                        ContaCorrente contaC = new ContaCorrente();
                        contaC.setNumConta(numConta);
                        contaC.setSaldo(saldo);
                        banco.inserir(contaC);

                        System.out.println("Conta criada com sucesso");

                    } else if (escolha == 2) {

                        System.out.println("Insira numero da conta");
                        int numConta = scan.nextInt();

                        System.out.println("Insira o saldo da conta");
                        double saldo = scan.nextDouble();

                        ContaPoupanca contaP = new ContaPoupanca();
                        contaP.setNumConta(numConta);
                        contaP.setSaldo(saldo);
                        banco.inserir(contaP);

                        System.out.println("Conta criada com sucesso");

                    }

                    break;

                case 2:
                    System.out.println("Insira o numero da conta");
                    int numConta = scan.nextInt();
                    if(banco.procurarConta(numConta) != null){
                        System.out.println("1. Depositar");
                        System.out.println("2. Sacar");
                        System.out.println("3. Transferir");
                        System.out.println("4. Gerar Relatório");
                        System.out.println("5. Retornar ao Menu");
                        System.out.println("Selecione uma opção: ");
                        opcao = scan.nextInt();
                     
                    }

            }

        } while (opcao != 5);

    }
}
