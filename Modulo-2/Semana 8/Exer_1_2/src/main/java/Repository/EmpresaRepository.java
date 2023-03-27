package Repository;

import java.util.ArrayList;

public class EmpresaRepository {

    private static ArrayList<String> empresas = new ArrayList<>();

    public static boolean addEmpresa(String empresa) {
        return empresas.add(empresa);
    }

    public static ArrayList<String> getEmpresas() {
        return empresas;
    }
}
