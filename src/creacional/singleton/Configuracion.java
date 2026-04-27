package creacional.singleton;

public class Configuracion {
    /**
     * Guarda una única instancia compartida para todo el programa
     */
    private static Configuracion instancia;

    private String idioma;
    private boolean modoOscuro;

    /**
     * Al ser private, impide que se puedan crear otras configuraciones diferentes a la instancia
     */
    private Configuracion() {
        idioma = "es";
        modoOscuro = false;
    }

    /**
     * Esta es la única "puerta de entrada" al objeto
     * @return
     */
    public static Configuracion getInstancia() {
        if (instancia == null) instancia = new Configuracion();
        return instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }
}
