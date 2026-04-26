package creacional.builder.v2;

public class DirectorMenu {
    public void construirMenuCompleto(MenuBuilder builder) {
        builder.reset();
        builder.construirBebida();
        builder.construirPlatoPrincipal();
        builder.construirPostre();
        builder.construirRegalo();
    }

    public void construirMenuSinPostre(MenuBuilder builder) {
        builder.reset();
        builder.construirBebida();
        builder.construirPlatoPrincipal();
        builder.construirRegalo();
    }
}
