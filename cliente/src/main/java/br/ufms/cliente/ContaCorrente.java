package br.ufms.cliente;

public class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente(int numero) {
        this(numero, 300);
    }

    public ContaCorrente(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    public void sacar(double valor) throws Exception {
        if (valor > saldo + limite) {
            throw new Exception("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
}
