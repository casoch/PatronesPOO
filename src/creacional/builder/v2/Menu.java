package creacional.builder.v2;

public class Menu {
    private String bebida;
    private String platoPrincipal;
    private String postre;
    private String regalo;

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setPlatoPrincipal(String platoPrincipal) {
        this.platoPrincipal = platoPrincipal;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "bebida='" + bebida + '\'' +
                ", platoPrincipal='" + platoPrincipal + '\'' +
                ", postre='" + postre + '\'' +
                ", regalo='" + regalo + '\'' +
                '}';
    }
}
