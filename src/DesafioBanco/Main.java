package DesafioBanco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria", "123.456.789-00");
        Cliente cliente2 = new Cliente("João", "987.654.321-00");

        Conta contaCorrente = new ContaCorrente(cliente1, "001");
        Conta contaPoupanca = new ContaPoupanca(cliente2, "002");

        System.out.println(" DEPÓSITOS ");
        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(1000.0);

        System.out.println("\n SAQUES ");
        contaCorrente.sacar(1400.0);
        contaPoupanca.sacar(500.0);

        System.out.println("\n---- TRANSFERÊNCIA ----");
        contaCorrente.transferir(contaPoupanca, 100.0);

        System.out.println("\nSALDO FINAl");
        System.out.println("Conta Corrente - Maria: R$" + contaCorrente.getSaldo());
        System.out.println("Conta Poupança - João: R$" + contaPoupanca.getSaldo());
    }
}
