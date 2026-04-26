package creacional.builder.v1;

public class Principal {

    public static void main(String[] args) {
        Menu menu = new MenuBuilder().bebida("Cocacola").incluyeCafe(true).
                incluyePan(false).postre("fresas con nata").platoPrincipal("Macarrones").build();
        System.out.println(menu);
    }


}
