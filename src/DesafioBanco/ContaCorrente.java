package DesafioBanco;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente titular, String numeroConta) {
        super();
        this.titular = titular;
       this.numeroConta = numeroConta;
    }

    @Override
        public boolean sacar(double valor) {
        return false;
    }
}
