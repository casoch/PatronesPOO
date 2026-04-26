package estructural.adapter;

public class UsuarioAdapter implements Usuario{
    private UsuarioAPIExterna usuarioAPI;

    public UsuarioAdapter(UsuarioAPIExterna usuarioAPI) {
        this.usuarioAPI = usuarioAPI;
    }

    @Override
    public String getNombre() {
        return usuarioAPI.fullName;
    }

    @Override
    public int getEdad() {
        return Integer.parseInt(usuarioAPI.age);
    }
}
