public class Frutas {

    public static void main(String[] args) {

        // Arreglo unidimensional de 4 frutas
        String[] frutas = {
            "Manzana",
            "Guayaba",
            "Uva",
            "Mango"
        };

        // Mostrar las frutas
        System.out.println("Frutas del arreglo:");

        for (int i = 0; i < frutas.length; i++) {

            System.out.println(
                "Fruta [" + i + "] = " + frutas[i]
            );
        }
    }
}