package estructural.adapter;

public class UsuarioAPIExterna {
    public String fullName; //Se accede por fullName, no por getNombre
    public String age; //Viene como String, no como int.
                       //Se accede por age, no por getEdad
}
