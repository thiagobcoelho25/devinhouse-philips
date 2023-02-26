public class Exer_6 {
    public void validar(String valorCampo, Integer valorMaximoCampo) throws TamanhoInvalidoException {
        if (valorCampo == null || valorMaximoCampo == null
                || valorMaximoCampo < 0) {
            throw new IllegalArgumentException(); // unchecked - nao checkada
        }
        if (valorCampo.length() > valorMaximoCampo) {
            throw new TamanhoInvalidoException(); // checked - checkada
        }
    }

    public static void main(String[] args) {
        Exer_6 exercicio = new Exer_6();
        try {
            exercicio.validar("tiago", 10);
            System.out.println("Funcionou");
        } catch (TamanhoInvalidoException | IllegalArgumentException e) {
            System.out.println("Deu problema!");
        }
    }
}
