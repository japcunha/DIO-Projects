package DesafioBanco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular, String numeroConta) {
        super(titular, numeroConta);
    }

    @Override
    public boolean sacar(double valor) {
        // Só permite se saldo >= valor
        return false;
    }
}
