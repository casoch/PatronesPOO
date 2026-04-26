package comportamiento.observer;

import java.util.Objects;

public class Cliente implements IObservadorStock {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void actualizar(String nombreProducto) {
        System.out.println("Aviso para " + nombre + " (" + email + "): "
                + "el producto \"" + nombreProducto + "\" ya vuelve a estar en stock.");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(email, cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
