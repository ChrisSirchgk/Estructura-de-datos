import java.util.Scanner;
import java.util.Stack;

public class InvertirPalabra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        // Guardar letras en la pila
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        // Invertir palabra
        String invertida = "";

        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }

        System.out.println("Palabra invertida: " + invertida);

        // Verificar palíndromo
        if (palabra.equalsIgnoreCase(invertida)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }

        sc.close();
    }
}