package creacional.builder.v1;

public class MenuBuilder {
    private String platoPrincipal;
    private String bebida;
    private String postre;
    private boolean incluyeCafe;
    private boolean incluyePan;

    public MenuBuilder platoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
        return this;
    }

    public MenuBuilder bebida(String bebida) {
        this.bebida = bebida;
        return this;
    }

    public MenuBuilder postre(String postre) {
        this.postre = postre;
        return this;
    }

    public MenuBuilder incluyeCafe(boolean incluyeCafe) {
        this.incluyeCafe = incluyeCafe;
        return this;
    }

    public MenuBuilder incluyePan(boolean incluyePan) {
        this.incluyePan = incluyePan;
        return this;
    }

    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public String getBebida() {
        return bebida;
    }

    public String getPostre() {
        return postre;
    }

    public boolean isIncluyeCafe() {
        return incluyeCafe;
    }

    public boolean isIncluyePan() {
        return incluyePan;
    }

    public Menu build() {
        return new Menu(this);
    }
}
