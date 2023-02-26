public class Aluno extends Pessoa{

    private String matricula;

    public String registrar() {
        String nomeCompleto = obterNomeCompleto();
        return "Sou o " + nomeCompleto + " e minha matrícula é "
                + matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
