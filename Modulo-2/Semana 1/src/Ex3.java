public class Ex3 {

    public static void main(String[] args) {

        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        // questão a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem;
        System.out.println("QUESTÃO A: ");
        for(int i = 0; i < extrato.length; i++){
            System.out.print(extrato[i] + " ");
        }
        System.out.println();

        // questão b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro);
        System.out.println("QUESTÃO B: ");
        for(int i = extrato.length - 1; i >= 0; i--){
            System.out.print(extrato[i] + " ");
        }
        System.out.println();

        // questão c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero),
        //imprima o resultado no console. (Dica: crie uma variável saldo inicializada com zero e vá atualizando seu valor);
        System.out.println("QUESTÃO C: ");
        int saldo_inicial = 0;
        for(int i = 0; i < extrato.length; i++){
            saldo_inicial = saldo_inicial + extrato[i];
        }
        System.out.println("Resultado final é: " + saldo_inicial);

        // questão d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.
        System.out.println("QUESTÃO D: ");
        System.out.println( (saldo_inicial > 0) ? "saldo positivo" : "saldo negativo" );
    }
}
