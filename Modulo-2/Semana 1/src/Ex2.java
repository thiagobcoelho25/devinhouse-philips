import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex2 {

    public static void main(String[] args) {

        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };


        System.out.println("valor da nota do primeiro elemento do terceiro array de notas é: " + notas[2][0]);
        System.out.println("valor da nota do segundo elemento do quarto array de notas é: " + notas[3][1]);
        System.out.println("valor da soma das quatro primeiras notas de " +
                "cada array é: " + Arrays.stream(notas).map(elements -> Arrays.stream(elements).sum()).collect(Collectors.toList()));
    }

}
