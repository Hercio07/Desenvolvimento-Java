package classes;

public abstract class ContaBancaria {

    protected int numConta;
    protected double saldo;
    protected String historico;

    public ContaBancaria() {

    }

    public ContaBancaria(int numConta, String historico) {
        this.numConta = numConta;
        this.saldo = 0;
        this.historico = historico;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public abstract double sacar(double valorsaque);

    public abstract double depositar(double deposito);

    public void transferir(double valor, ContaBancaria conta) {

        this.sacar(valor);
        conta.depositar(valor);
    }

}
