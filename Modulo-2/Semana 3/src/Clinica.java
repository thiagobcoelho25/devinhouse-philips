import java.util.ArrayList;
import java.util.Optional;

public class Clinica {
    private String id;
    private String nome_dono;
    private String nome_clínica;
    private String cnpj;
    private String endereco;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Clinica(String nome_dono) {
        this.nome_dono = nome_dono;
    }

    public Clinica(String nome_dono, ArrayList<Cliente> clientes) {
        this.nome_dono = nome_dono;
        this.clientes = clientes;
    }

    public void addCLiente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public double calcularIMC(double peso, double altura){
        double imc = peso / Math.pow(altura,2);

        if(imc < 16.5) {
            System.out.println("Peso severamente abaixo do normal");
        } else if(imc < 18.5) {
            System.out.println("Peso abaixo do normal");
        } else if(imc < 24.99) {
            System.out.println("Normal");
        } else if ( imc < 29.99) {
            System.out.println("Pré-obeso");
        } else if ( imc < 34.99) {
            System.out.println("Obesidade classe I");
        } else if ( imc < 39.99) {
            System.out.println("Obesidade classe II");
        }else if ( imc >= 40) {
            System.out.println("Obesidade classe III");
        }

        return imc;
    }

    public double tratamento(int id_cliente){
        return reduzPeso(id_cliente, 5);
    }

    public double reduzPeso(int id_cliente, int peso_a_reduzir){
        Optional<Cliente> cliente_optional = clientes.stream().filter(cliente -> cliente.getId() == id_cliente).findFirst();

        if(cliente_optional.isPresent()){
            cliente_optional.get().setPeso(cliente_optional.get().getPeso() - peso_a_reduzir);
            return cliente_optional.get().getPeso();
        } else {
            System.out.println("cliente não identificado");
            return 0;
        }
    }

    public String getAllClientes(){
        return this.clientes.toString();
    }

    public String getId() {
        return id;
    }

    public String getNome_dono() {
        return nome_dono;
    }

    public String getNome_clínica() {
        return nome_clínica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }
}
