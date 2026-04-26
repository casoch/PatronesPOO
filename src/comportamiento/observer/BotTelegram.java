package comportamiento.observer;

import java.util.Objects;

public class BotTelegram implements IObservadorStock {
    private String nombre;
    private String direccion;

    public BotTelegram(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public void actualizar(String nombreProducto) {
        System.out.println("El Bot "+nombre+" avisa de que "+nombreProducto+
                " está disponible");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BotTelegram that)) return false;
        return Objects.equals(nombre, that.nombre) && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion);
    }
}
