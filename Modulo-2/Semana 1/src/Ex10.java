public class Ex10 {

    public static void main(String[] args) {

        // Exemplos para testar: osso, ana, radar
        String palavra_para_testar = "osso";

        if(palavra_para_testar.equals(new StringBuilder(palavra_para_testar).reverse().toString())){
            System.out.println("É Palíndromo");
        } else {
            System.out.println("Não É Palíndromo");
        }

    }
}
