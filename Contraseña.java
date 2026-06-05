import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String contrasenaCorrecta = "11111";
        String contrasena = "";

        // Repetir mientras la contraseña sea incorrecta
        while (!contrasena.equals(contrasenaCorrecta)) {

            System.out.print("Contraseña: ");
            contrasena = entrada.nextLine();

            if (!contrasena.equals(contrasenaCorrecta)) {
                System.out.println("Acceso denegado");
            }
        }

        System.out.println("Acceso permitido");
    }
}