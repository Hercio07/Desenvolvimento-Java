package classes;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private double taxaDeOperacao;

    public ContaCorrente() {

    }

    public ContaCorrente(int numConta, String historico, double taxaDeOperacao) {
        super(numConta, historico);
        taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public double sacar(double valorSaque) {
        // saldo = saldo - (valorSaque + taxaDeOperacao)
        saldo -= (valorSaque + taxaDeOperacao);
        return saldo;
    }

    @Override
    public double depositar(double deposito) {
        // saldo = saldo + valorDeposito
        saldo += (deposito - taxaDeOperacao);
        return saldo;
    }
 
    @Override
    public void mostrarDados(){
        System.out.println("Numero da conta: "+ numConta);
        System.out.println("Saldo: "+ saldo);
        
    }

}
