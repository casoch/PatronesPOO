package estructural.adapter;


public class Principal {
    public static void main(String[] args) {
        UsuarioAPIExterna api = new UsuarioAPIExterna();
        api.fullName = "Ana López";
        api.age = "25";

        Usuario usuario = new UsuarioAdapter(api);

        ServicioUsuarios servicio = new ServicioUsuarios();
        servicio.imprimirUsuario(usuario);

    }
}
