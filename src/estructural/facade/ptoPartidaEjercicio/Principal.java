package estructural.facade.ptoPartidaEjercicio;

public class Principal {
    public static void main(String[] args) {

        String nombre = "Laura García";
        String dni = "12345678A";
        String tipoPlan = "Musculación";
        double cuotaMensual = 39.99;

        ServicioSocios servicioSocios = new ServicioSocios();
        ServicioEntrenamiento servicioEntrenamiento = new ServicioEntrenamiento();
        ServicioTarjeta servicioTarjeta = new ServicioTarjeta();
        ServicioPago servicioPago = new ServicioPago();
        ServicioNotificaciones servicioNotificaciones = new ServicioNotificaciones();

        servicioSocios.registrarSocio(nombre, dni);
        servicioEntrenamiento.asignarPlan(nombre, tipoPlan);
        servicioTarjeta.generarTarjeta(nombre);
        servicioPago.activarPago(dni, cuotaMensual);
        servicioNotificaciones.enviarBienvenida(nombre);
    }
}
