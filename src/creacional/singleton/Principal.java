package creacional.singleton;

public class Principal {
    public static void main(String[] args) {
        Configuracion c1 = Configuracion.getInstancia();
        Configuracion c2 = Configuracion.getInstancia();

        c1.setIdioma("en");
        c1.setModoOscuro(true);

        System.out.println(c2.getIdioma());
        System.out.println(c2.isModoOscuro());

        System.out.println("Misma instancia? "+(c1 == c2));
    }
}
