package creacional.simple_factory;

public class Principal {
    public static void main(String[] args) {
        Notificacion not1 = NotificacionFactory.crearNotificacion("sms");
        not1.notificar("Recordatorio de visita médica por "+not1.getClass());

        Notificacion not2 = NotificacionFactory.crearNotificacion("email");
        not2.notificar("Recordatorio de visita médica por "+not2.getClass());

        Notificacion not3 = NotificacionFactory.crearNotificacion("whatsapp");
        not3.notificar("Recordatorio de visita médica por "+not3.getClass());
    }
}
