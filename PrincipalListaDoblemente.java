import java.util.Scanner;

public class PrincipalListaDoblemente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        int opcion;
        String dato, nuevo;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Mostrar de inicio a fin");
            System.out.println("4. Mostrar de fin a inicio");
            System.out.println("5. Buscar");
            System.out.println("6. Modificar");
            System.out.println("7. Eliminar");
            System.out.println("8. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Dato: ");
                    dato = sc.nextLine();
                    lista.agregarInicio(dato);
                    break;

                case 2:
                    System.out.print("Dato: ");
                    dato = sc.nextLine();
                    lista.agregarFinal(dato);
                    break;

                case 3:
                    System.out.println("Recorrido hacia adelante:");
                    lista.recorrerAdelante();
                    break;

                case 4:
                    System.out.println("Recorrido hacia atrás:");
                    lista.recorrerAtras();
                    break;

                case 5:
                    System.out.print("Dato a buscar: ");
                    dato = sc.nextLine();
                    lista.buscar(dato);
                    break;

                case 6:
                    System.out.print("Dato a modificar: ");
                    dato = sc.nextLine();
                    System.out.print("Nuevo dato: ");
                    nuevo = sc.nextLine();
                    lista.modificar(dato, nuevo);
                    break;

                case 7:
                    System.out.print("Dato a eliminar: ");
                    dato = sc.nextLine();
                    lista.eliminar(dato);
                    break;

                case 8:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        sc.close();
    }
}