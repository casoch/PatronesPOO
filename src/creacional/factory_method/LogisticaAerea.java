package creacional.factory_method;

/**
 * Subclase creadora
 */
public class LogisticaAerea extends EmpresaLogistica {
    @Override
    public Transporte crearTransporte() {
        return new Avion();
    }
}
