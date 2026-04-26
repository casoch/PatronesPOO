package creacional.builder.v2;

public class MenuInfantilBuilder implements MenuBuilder{
    private Menu menu;

    public MenuInfantilBuilder() {
        reset();
    }

    @Override
    public void reset() {
        menu = new Menu();
    }

    @Override
    public void construirBebida() {
        menu.setBebida("Zumo de naranja");
    }

    @Override
    public void construirPlatoPrincipal() {
        menu.setPlatoPrincipal("Hamburguesa con patatas");
    }

    @Override
    public void construirPostre() {
        menu.setPostre("Helado");
    }

    @Override
    public void construirRegalo() {
        menu.setRegalo("Juguete mini");
    }

    public Menu getResultado()
    {
        Menu resultado = menu;
        reset();
        return resultado;
    }
}
