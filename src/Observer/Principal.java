package Observer;

public class Principal {
    public static void main(String[] args) {
        Producto producto = new Producto("PlayStation 6", 0);

        Cliente c1 = new Cliente("Mireia", "mireia@gmail.com");
        Cliente c2 = new Cliente("Carlos", "carlos@gmail.com");
        Cliente c3 = new Cliente("Anna", "anna@gmail.com");

        producto.suscribir(c1);
        producto.suscribir(c2);
        producto.suscribir(c3);

        producto.reponerStock(5);
    }
}
