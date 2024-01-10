public class EstructurasControlOperadores {
    public static void main(String []args) {

        //Operadores logicos
        // and = &&, si dos o 3 cosas son verdaderas todas. de no ser asi no es true.
        // or = ||, si alguna cosa es verdadera, con que alguna de las cosas sea verdadera se cumple.
        // not = !

        // == si dos cosas son iguales. equals
        // != ,no son iguales. not equals
        // < menor
        // > mayor
        // <= menor o igual que
        //>= mayor o igual que

        /*

            Salario anual del usuario es mayor a 100.000 -> le damos el prestamo
            Salario anual del usuario es mayor a 50.000 y su edad es menor que 30 anos-> le damos la mitad


         */

        int salarioAnual = 60000;
        int edadPersona = 29;

        if(salarioAnual>100000 && edadPersona>=30){
            System.out.println("Prestamo concedido.");
        } else if (salarioAnual>50000 && edadPersona<30) {
            System.out.println("Se te ha concedido la mitad del prestamo.");

        } else if (salarioAnual<50000 || edadPersona<18) {
            System.out.println("Prestamo rechazado.");

        }

    }
}
