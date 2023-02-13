import java.util.Arrays;
import java.util.List;

public class Ex7 {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        // a) Percorra a lista usando o operador 'for' clássico, usando uma variável para iterar pelos índices, e imprima no console os valores de cada nome;
        for(int i = 0; i < nomes.size(); i++ ){
            System.out.print(nomes.get(i) + " ");
        }

        System.out.println();

        // b) Percorra a lista usando o operador 'for-each' usando a forma simplificada, e imprima no console os valores de cada nome;
        for ( String nome : nomes) {
            System.out.print(nome + " ");
        }

        System.out.println();

        // c) Percorra a lista usando o operador 'while', e imprima no console os valores de cada nome;
        int qtd_nomes = 0;
        while(qtd_nomes < nomes.size()){
            System.out.print(nomes.get(qtd_nomes) + " ");
            qtd_nomes++;
        }
    }

}
