package creacional.simple_factory;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {
        tipo = tipo.toLowerCase();
        if (tipo.equals("email")) return new EmailNotificacion();
        else if (tipo.equals("sms")) return new SMSNotificacion();
        else if (tipo.equals("whatsapp")) return new WhatsappNotificacion();
        else return null;
    }
}
