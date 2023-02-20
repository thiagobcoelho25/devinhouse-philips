public class Main {
    public static void main(String[] args) {

        Cliente cliente_1 = new Cliente(1, 70, 1.90, 26);
        Cliente cliente_2 = new Cliente(2, 80, 1.91, 29);
        Cliente cliente_3 = new Cliente(3, 75, 1.76, 24);

        Clinica clinica = new Clinica( "Dono_1");

        clinica.addCLiente(cliente_1);
        clinica.addCLiente(cliente_2);
        clinica.addCLiente(cliente_3);

        System.out.println(clinica.getAllClientes());

        clinica.tratamento(4);
        clinica.tratamento(3);

        System.out.println(clinica.getAllClientes());

        System.out.println(clinica.calcularIMC(cliente_1.getPeso(), cliente_1.getAltura()));

        clinica.reduzPeso(1,20);
        System.out.println(clinica.getAllClientes());
    }
}