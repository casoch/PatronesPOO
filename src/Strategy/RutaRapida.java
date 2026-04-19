package Strategy;

/**
 * Estrategia concreta.
 */
public class RutaRapida implements EstrategiaRuta{
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta rápida desde " + origen + " hasta " + destino +
                ": Autopista C-58. Tiempo estimado: 20 min.";
    }
}
