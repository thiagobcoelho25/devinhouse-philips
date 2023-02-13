import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex4 {

    public static void main(String[] args) {

        int sorteados[][] = {
                { 1, 44,  6,  2, 45, 60},
                {10, 21, 55, 25, 34, 44},
                { 8, 18, 28, 29, 55, 59},
                {60, 25, 11, 34,  6,  9},
                {55, 43, 25, 12,  7, 11}
        };

        int qtd_n_sorte = 0;
        for(int i = 0; i < sorteados.length; i++){
            for(int j = 0; j < sorteados[i].length; j++){
                if(sorteados[i][j] == 25){
                    qtd_n_sorte = qtd_n_sorte + 1;
                }
            }
        }

        System.out.println("Quantidade numero da sorte é: " + qtd_n_sorte);

    }

}
