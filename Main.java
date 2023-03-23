public class Main {
    public static void main(String[] args) {
        Cliente clienteRaul = new Cliente("Raul", "503.702.748-90");
        Conta contaRaul = new Conta(clienteRaul, 0);
        contaRaul.depositar(500);

        Cliente clienteRaul1 = new Cliente("Raul2", "503.702.748-90");
        Conta contaRaul1 = new Conta(clienteRaul1, 0);
        contaRaul1.depositar(500);
        contaRaul.transferir(contaRaul1, 50);
    }
}
