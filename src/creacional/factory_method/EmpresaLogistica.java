package creacional.factory_method;

/**
 * Clase creadora siempre abstract
 */
public abstract class EmpresaLogistica {
    public void planificarEntrega() {
        Transporte transporte = crearTransporte();
        transporte.entregar();
    }

    /**
     * Éste es el método fábrica. Creará el objeto concreto, pero todavía no sabemos cuál.
     * Depende de cómo se le pida memoria a esta clase.
     * @return
     */
    public abstract Transporte crearTransporte();
}
