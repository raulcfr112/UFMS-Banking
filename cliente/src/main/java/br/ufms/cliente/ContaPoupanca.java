package br.ufms.cliente;

public class ContaPoupanca extends ContaBancaria {

    private float taxaRendimento;

    public ContaPoupanca(int numero) {
        this(numero, 0.5f);
    }

    public ContaPoupanca(int numero, float taxaRendimento) {
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    public void sacar(double valor) throws Exception {
        if (valor > saldo) {
            throw new Exception("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

}
