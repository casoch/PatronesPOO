package creacional.simple_factory;

public class EmailNotificacion implements Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando email con: "+mensaje);
    }
}
