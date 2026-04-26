package estructural.facade;

public class AgenciaViajesFacade {
    private BuscadorVuelos vuelos;
    private BuscadorHoteles hoteles;
    private ServicioPago pago;
    private ServicioEmail email;

    public AgenciaViajesFacade() {
        vuelos = new BuscadorVuelos();
        hoteles = new BuscadorHoteles();
        pago = new ServicioPago();
        email = new ServicioEmail();
    }

    public void reservarViaje(String origen, String destino, double importe, String correo) {
        vuelos.buscarVuelo(origen, destino);
        hoteles.buscarHotel(destino);
        pago.pagar(importe);
        email.enviarConfirmacion(correo);
    }
}
