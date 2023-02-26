public class Produto implements Tributavel{

    private Double valor;
    private Double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return valor + valorImposto;
    }
}
