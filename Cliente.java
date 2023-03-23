public class Cliente {

    private String nome, cpf;

    public Cliente(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public static boolean isValidCPF(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");
        if (cpf.length() != 11 || cpf.matches(cpf.charAt(0) + "{11}")) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (10 - i) * Character.getNumericValue(cpf.charAt(i));
        }
        int digit1 = 11 - (sum % 11);
        if (digit1 > 9) {
            digit1 = 0;
        }
        sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (11 - i) * Character.getNumericValue(cpf.charAt(i));
        }
        sum += digit1 * 2;
        int digit2 = 11 - (sum % 11);
        if (digit2 > 9) {
            digit2 = 0;
        }
        return digit1 == Character.getNumericValue(cpf.charAt(9)) && digit2 == Character.getNumericValue(cpf.charAt(10));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome vazio");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (isValidCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("Cpf incorreto!");
        }
    }
}
