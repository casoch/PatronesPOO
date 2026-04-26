package creacional.factory_method;

public class Principal {
    public static void main(String[] args) {
        EmpresaLogistica el1  = new LogisticaTerrestre();
        el1.planificarEntrega();

        EmpresaLogistica el2 = new LogisticaAerea();
        el2.planificarEntrega();
    }
}
