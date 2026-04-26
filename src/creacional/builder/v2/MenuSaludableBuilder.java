package creacional.builder.v2;

public class MenuSaludableBuilder implements MenuBuilder{
    private Menu menu;

    public MenuSaludableBuilder() {
        reset();
    }

    @Override
    public void reset() {
        menu = new Menu();
    }

    @Override
    public void construirBebida() {
        menu.setBebida("Agua");
    }

    @Override
    public void construirPlatoPrincipal() {
        menu.setPlatoPrincipal("Ensalada de pollo");
    }

    @Override
    public void construirPostre() {
        menu.setPostre("Fruta natural");
    }

    @Override
    public void construirRegalo() {
        menu.setRegalo("Sin regalo");
    }

    public Menu getResultado()
    {
        Menu resultado = menu;
        reset();
        return resultado;
    }
}
