package State;

public class Principal {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();

        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
    }
}
