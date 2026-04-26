package estructural.adapter;

public class ServicioUsuarios {
    public void imprimirUsuario(Usuario u){
        System.out.println(u.getNombre()+" - "+u.getEdad());
    }
}
