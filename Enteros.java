public class Enteros {

    public static void main(String[] args) {

        // Vector de enteros
        int[] numeros = {15, 30, 45, 60};

        int suma = 0;

        // Recorrer el vector y sumar los elementos
        for (int i = 0; i < numeros.length; i++) {

            suma = suma + numeros[i];

            System.out.println("Número [" + i + "] = " + numeros[i]);
        }

        // Mostrar resultado de la suma
        System.out.println("La suma total es: " + suma);
    }
}