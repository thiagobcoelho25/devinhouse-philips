import java.util.Scanner;

public class Exer_4 {

    public static void main(String[] args) {
        Exer_4 exercicio = new Exer_4();
        Integer idade = null;
        while (idade == null) {
            try {
                idade = exercicio.perguntarIdade();
            } catch (IdadeInvalidaException e) {
                System.out.println("A idade informada não é válida!");
            }
        }
        System.out.printf("Olá, você tem %d anos de idade", idade);
    }

    private Integer perguntarIdade() throws IdadeInvalidaException {
        System.out.println("Qual a sua idade? ");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        if (idade <= 0 || idade > 100)
            throw new IdadeInvalidaException();
        return idade;
    }
}
