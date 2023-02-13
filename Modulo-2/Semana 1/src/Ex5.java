import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        int[] arr = {-2,-2,-2,-2};

        Ex5 ex5 = new Ex5();
        ex5.calcular(arr);
    }

    private void calcular(int[] array){
        try {
            int maior = Arrays.stream(array).max().orElse(0);
            int menor = Arrays.stream(array).min().orElse(0);
            System.out.println("O maior valor e o menor valor é: " + maior + " e " + menor);
        } catch (NullPointerException e) {
            System.out.println("Não é possível calcular");
        }
    }

}
