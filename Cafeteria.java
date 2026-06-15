import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Cafeteria {
    public static void main(String[] args) {

        Queue<String> clientes = new LinkedList<>();
        Stack<String> cancelados = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int opcion;
        String nombre;

        do {
            System.out.println("\n--- MENU CAFETERIA ---");
            System.out.println("1. Llegar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Mostrar cancelaciones");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del cliente: ");
                    nombre = sc.nextLine();
                    clientes.add(nombre);
                    System.out.println("Cliente agregado.");
                    break;

                case 2:
                    if (!clientes.isEmpty()) {
                        System.out.println("Atendiendo a: " + clientes.poll());
                    } else {
                        System.out.println("No hay clientes en espera.");
                    }
                    break;

                case 3:
                    if (!clientes.isEmpty()) {
                        String cancelado = clientes.poll();
                        cancelados.push(cancelado);
                        System.out.println("Pedido cancelado de: " + cancelado);
                    } else {
                        System.out.println("No hay clientes para cancelar.");
                    }
                    break;

                case 4:
                    System.out.println("Cola de clientes: " + clientes);
                    break;

                case 5:
                    System.out.println("Pedidos cancelados: " + cancelados);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}