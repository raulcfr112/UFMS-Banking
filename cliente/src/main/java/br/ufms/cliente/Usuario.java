package br.ufms.cliente;

public class Usuario {

    private String nome;

    private final String cpf;

    private String telefone;

    private String usuario;

    private String senha;

    protected Usuario(String nome, String cpf, String usuario, String senha) {
        if (validarUsuario(usuario)) {
            this.usuario = usuario;
        }
        if (validarSenha(senha)) {
            this.senha = senha;
        }
        this.nome=nome;
        this.cpf = cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (validarSenha(senha)) {
            this.senha = senha;
        }
    }

    private static boolean validarUsuario(String usuario) {
        if (usuario == null || usuario.isEmpty()) {
            throw new IllegalArgumentException("Usuario não pode ser nulo ou vazio");
        }
        return true;
    }

    private static boolean validarSenha(String senha) {
        if (senha == null || senha.isEmpty()) {
            throw new IllegalArgumentException("Senha não pode ser nula ou vazia");
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
