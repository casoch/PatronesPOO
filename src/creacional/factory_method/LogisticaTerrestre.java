package creacional.factory_method;

/**
 * Subclase creadora
 */
public class LogisticaTerrestre extends EmpresaLogistica {
    @Override
    public Transporte crearTransporte() {
        return new Camion();
    }
}
