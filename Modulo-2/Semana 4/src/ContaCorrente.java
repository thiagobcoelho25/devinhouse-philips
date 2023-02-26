public class ContaCorrente extends Conta implements Operavel{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        return saldo -= valor;
    }

    @Override
    protected double obterSaldoAtual() {
        return saldo;
    }
}
