package br.ufms.cliente;

public class Banco {

    private String nomeDoBanco;

    private Cliente[] clientes = new Cliente[100];

    public Banco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public void adicionarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                break;
            }
        }
    }

    public void excluirCliente(Cliente cliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].equals(cliente)){
                clientes[i]=null;
                break;
            }
        }
    }

    public Cliente buscarPorCPF(String cpf){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].getCpf() == cpf){
                return clientes[i];
            }
        }
        return null;
    }

    public Cliente buscarPorNumero(int numeroConta) {
        return null;
    }

    public Cliente[] buscarPorNome(String nome) {
        return null;
    }

}
