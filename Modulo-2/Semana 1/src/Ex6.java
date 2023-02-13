import java.util.Arrays;
import java.util.List;

public class Ex6 {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4);

        List<Integer> lista_triplicada = lista.stream().map(ele -> ele * 3).toList();

        System.out.println(lista_triplicada);
    }


}
