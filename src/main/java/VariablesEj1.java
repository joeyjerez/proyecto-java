public class VariablesEj1 {

    public static void main(String[] args) {

        String nombrePersona = "Joey";
        char inicialNombre = 'J';
        short edadPersona2 = 25;
        int edadPersona = 20; //-2,147,483,648 y el maximo 2,147,483,647
        long numeroTelefono = 65578412;
        double precioEnUsd = 54.40;
        float  precioEnUsd2 = 54.40f;

        boolean esMayorDeEdad = false;

        System.out.println(edadPersona);
        System.out.println("Hola me llamo "+nombrePersona+", y tengo "+edadPersona+" anos");
    }
}
