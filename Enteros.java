public class Enteros {

    public static void main(String[] args) {

        // Vector de enteros
        int[] numeros = {15, 30, 45, 60};

        int suma = 0;
        double promedio;

        int mayores = 0;
        int menores = 0;

        // Recorrer el vector
        for (int i = 0; i < numeros.length; i++) {

            suma = suma + numeros[i];

            System.out.println("Número [" + i + "] = " + numeros[i]);
        }

        // Calcular promedio
        promedio = (double) suma / numeros.length;

        // Contar mayores y menores al promedio
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > promedio) {
                mayores++;
            } else if (numeros[i] < promedio) {
                menores++;
            }
        }

        // Mostrar resultados
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);

        System.out.println("Cantidad de números mayores al promedio: " + mayores);
        System.out.println("Cantidad de números menores al promedio: " + menores);
    }
}