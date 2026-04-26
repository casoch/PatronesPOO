package creacional.simple_factory;

public class SMSNotificacion implements Notificacion {
    @Override
    public void notificar(String mensaje) {
        System.out.println("Enviando SMS con: " + mensaje);
    }
}
