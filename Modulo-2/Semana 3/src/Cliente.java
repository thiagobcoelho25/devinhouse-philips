public class Cliente {
    private int id;
    private double peso;
    private double altura;
    private int idade;

    public Cliente(int id, double peso, double altura, int idade) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.id = id;
    }
    public Cliente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", peso=" + peso +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }
}
