import java.util.Scanner;

public class MainRecursivo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();

        int resultado = MetodoRecursivo.factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);

        leer.close();
    }
}
