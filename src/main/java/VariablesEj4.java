public class VariablesEj4 {
    public static void main (String [] args) {
        //Matrices; filas y columnas, 2 indices.

        String myMatrix[][]= {
                {"Pedro", "Madrid"},
                {"Arturo", "Madrid"},
                {"Miguel", "Barcelona"}
        };

        myMatrix[2][1] = "Cordoba";

        System.out.println(myMatrix[2][1]);


    }
}
