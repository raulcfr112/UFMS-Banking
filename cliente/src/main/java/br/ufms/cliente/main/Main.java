package br.ufms.cliente.main;

import br.ufms.cliente.Banco;
import br.ufms.cliente.Cliente;

public class Main {

    public static void main(String[] args) {

        try {
            Banco banco = new Banco("Ufms-Bank");
            Cliente c1 = new Cliente("Kleber","Kleber123","000","123");
            Cliente c2 = new Cliente("Raul","raul","123","345");
            banco.adicionarCliente(c1);
            banco.adicionarCliente(c2);
            System.out.println(banco.buscarPorCPF("123").getNome());


        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
