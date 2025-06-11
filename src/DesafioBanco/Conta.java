package DesafioBanco;

public class Conta {
        protected Cliente titular;
        protected double saldo;
        protected String numeroConta;

        public Conta(Cliente titular, String numeroConta) {
            this.titular = titular;
            this.saldo = saldo;
            this.numeroConta = numeroConta;
        }

    public Conta() {
    }

    public void depositar(double valor) {
        }

    public boolean sacar(double valor) {

            return false;
    }

    public boolean transferir(Conta destino, double valor) {

            return false;
        }

    public Cliente getTitular() {

            return titular;
    }

    public void setTitular(Cliente titular) {

            this.titular = titular;
    }

    public double getSaldo() {

            return saldo;
    }

    public void setSaldo(double saldo) {

            this.saldo = saldo;
    }

    public String getNumeroConta() {

            return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {

            this.numeroConta = numeroConta;
    }
}
