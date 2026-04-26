package creacional.builder.v1;

public class Menu {
    private String platoPrincipal;
    private String bebida;
    private String postre;
    private boolean incluyeCafe;
    private boolean incluyePan;

    public Menu(MenuBuilder builder) {
        this.platoPrincipal = builder.getPlatoPrincipal();
        this.bebida = builder.getBebida();
        this.postre = builder.getPostre();
        this.incluyeCafe = builder.isIncluyeCafe();
        this.incluyePan = builder.isIncluyePan();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "platoPrincipal='" + platoPrincipal + '\'' +
                ", bebida='" + bebida + '\'' +
                ", postre='" + postre + '\'' +
                ", incluyeCafe=" + incluyeCafe +
                ", incluyePan=" + incluyePan +
                '}';
    }
}
