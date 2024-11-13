/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

public class Principal {

    public static void main(String[] args) {

        ContaCorrente contaC = new ContaCorrente();
        ContaPoupanca contaP = new ContaPoupanca();
        Relatorio r1 = new Relatorio();

        contaC.setNumConta(0001);
        contaC.setSaldo(1000);
        contaC.sacar(200);

        contaP.setNumConta(0001);
        contaP.setSaldo(500);
        contaP.sacar(600);

        r1.gerarRelatorio(contaC);
        r1.gerarRelatorio(contaP);

        System.out.println("Transferencia");
        contaC.transferir(100, contaP);
        System.out.println(contaC.getSaldo());
    }

}
