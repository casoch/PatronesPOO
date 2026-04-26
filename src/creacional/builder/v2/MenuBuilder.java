package creacional.builder.v2;

public interface MenuBuilder {
    public abstract void reset();
    public abstract void construirBebida();
    public abstract void construirPlatoPrincipal();
    public abstract void construirPostre();
    public abstract void construirRegalo();
}
