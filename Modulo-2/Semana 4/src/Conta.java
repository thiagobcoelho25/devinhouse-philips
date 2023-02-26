public abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    protected abstract double obterSaldoAtual();
}
