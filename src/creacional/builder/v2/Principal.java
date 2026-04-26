package creacional.builder.v2;

public class Principal {
    public static void main(String[] args) {
        DirectorMenu director = new DirectorMenu();

        MenuInfantilBuilder builderInfantil = new MenuInfantilBuilder();
        director.construirMenuCompleto(builderInfantil);
        Menu menuInfantil = builderInfantil.getResultado();
        System.out.println(menuInfantil);

        MenuSaludableBuilder builderSaludable = new MenuSaludableBuilder();
        director.construirMenuSinPostre(builderSaludable);
        Menu menuSaludable = builderSaludable.getResultado();
        System.out.println(menuSaludable);


    }
}
