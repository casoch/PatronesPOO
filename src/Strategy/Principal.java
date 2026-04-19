package Strategy;

public class Principal {
    public static void main(String[] args) {
        Navegador navegador = new Navegador(new RutaRapida());

        navegador.mostrarRuta("Casa", "Gimbernat");

        navegador.setEstrategiaRuta(new RutaCorta());
        navegador.mostrarRuta("Casa", "Gimbernat");

        navegador.setEstrategiaRuta(new RutaSinPeajes());
        navegador.mostrarRuta("Casa", "Gimbernat");
    }
}
