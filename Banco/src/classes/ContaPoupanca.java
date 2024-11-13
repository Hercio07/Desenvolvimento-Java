package classes;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

    private double limite;

    public ContaPoupanca() {

    }

    public ContaPoupanca(int numConta, String historico, double limite) {
        super(numConta, historico);
        this.limite = 200;
    }

    @Override
    public double sacar(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo = saldo - valorSaque;

        } else if (saldo < valorSaque && valorSaque <= limite) {
            saldo = limite - valorSaque;

        }
        if (valorSaque > saldo && valorSaque > limite) {
            System.out.println("Saldo insuficiente");

        }
        return saldo;

    }

    @Override
    public double depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;

        return saldo;

    }

  
    @Override
   public void mostrarDados(){
       System.out.println("Numero da conta: "+ numConta);
       System.out.println("Saldo: "+saldo);
       
   }

}
