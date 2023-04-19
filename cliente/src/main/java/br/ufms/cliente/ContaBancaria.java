package br.ufms.cliente;

import br.ufms.cliente.ContaCorrente;

public abstract class ContaBancaria {

    private int numero;

    protected double saldo;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor) throws Exception;

    public void transferir(double valor, ContaCorrente destino) throws Exception {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
