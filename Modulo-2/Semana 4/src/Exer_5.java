public class Exer_5 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setMatricula("123ABC");
        aluno.nome = "tiago";
        aluno.sobrenome = "albuquerque";
        String resultado = aluno.registrar();
        System.out.println(resultado);
    }

}
