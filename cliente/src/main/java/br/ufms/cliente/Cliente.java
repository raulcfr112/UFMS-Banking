package br.ufms.cliente;

public class Cliente extends Usuario {

    private ContaCorrente contaCorrente;

    private ContaPoupanca contaPoupanca;

    private static int contador = 0;

    public Cliente(String nome, String usuario, String cpf, String senha) {
        this(nome, usuario, cpf, senha, true, true);
    }

    public Cliente(String nome, String usuario, String cpf, String senha,
                   boolean temContaCorrente, boolean temContaPoupanca) {
        super(nome, cpf, usuario, senha);

        int numero = ++contador;

        if (!temContaCorrente && !temContaPoupanca) {
            new IllegalArgumentException("O cliente especificado não tem contas informadas");
        }

        if (temContaCorrente) {
            this.contaCorrente = new ContaCorrente(numero);
        }
        if (temContaPoupanca) {
            this.contaPoupanca = new ContaPoupanca(numero);
        }
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cliente) {
            Cliente outro = (Cliente) obj;
            return outro.getCpf() == this.getCpf();
        }
        return super.equals(obj);
    }

}
