package estructural.facade.ptoPartidaEjercicio;

public class ServicioPago {

    public void activarPago(String dni, double cuotaMensual) {
        System.out.println("Pago mensual activado para el DNI " + dni + ": " + cuotaMensual + " €");
    }
}
