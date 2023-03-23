public class Conta {

    private final Cliente cliente;
    private double saldo, limite;
    private int numeroDaConta;
    private static int controleNumeroDaConta;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = 300;
        this.numeroDaConta = ++controleNumeroDaConta;
    }

    public void transferir(Conta contaDestino, double valor) {
        this.sacar(this, valor);
        contaDestino.depositar(valor);
    }

    public void sacar(Conta conta, double valor) {
        if (this.saldo <= valor) {
            throw new IllegalArgumentException("Nao e possivel sacar um valor maior que o disponivel em conta!");
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Nao e possivel depositar um valor negativo ou igual a 0!");
        }
        this.saldo += valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
