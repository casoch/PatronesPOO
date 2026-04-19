package Observer;

import java.util.ArrayList;
import java.util.List;

public class Producto  {
    private String nombre;
    private int stock;
    private List<IObservadorStock> observadores;

    public Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
        this.observadores = new ArrayList<>();
    }

    public void suscribir(IObservadorStock observador) {
        observadores.add(observador);
    }

    public void desuscribir(IObservadorStock observador) {
        observadores.remove(observador);
    }

    public void reponerStock(int cantidad) {
        boolean estabaSinStock = (stock == 0);

        stock += cantidad;
        System.out.println("Se han añadido " + cantidad + " unidades de " + nombre +
                ". Stock actual: " + stock);

        if (estabaSinStock && stock > 0) {
            notificarObservadores();
        }
    }

    private void notificarObservadores() {
        System.out.println("Notificando a los clientes interesados...");
        for (IObservadorStock o : observadores) {
            o.actualizar(nombre);
        }
    }
}
