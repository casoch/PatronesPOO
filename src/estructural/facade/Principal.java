package estructural.facade;

public class Principal {
    /**
     * Esto funciona, pero en el main tenemos demasiada lógica.
     * El código debería quedar más simple.
     */
    public static void sinUsarFacade() {
        BuscadorVuelos vuelos = new BuscadorVuelos();
        BuscadorHoteles hoteles = new BuscadorHoteles();
        ServicioPago pago = new ServicioPago();
        ServicioEmail email = new ServicioEmail();

        vuelos.buscarVuelo("Barcelona", "Leipzig");
        hoteles.buscarHotel("Leipzig");
        pago.pagar(450);
        email.enviarConfirmacion("aaa@a.com");
    }

    public static void usandoFacade() {
        AgenciaViajesFacade agencia = new AgenciaViajesFacade();

        agencia.reservarViaje(
                "Barcelona",
                "Leipzig",
                450,
                "aaa@a.com"
        );
    }

    public static void main(String[] args) {
        sinUsarFacade();
        usandoFacade();
    }
}
