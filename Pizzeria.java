import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String tipoPizza = "";
        String ingrediente = "";

        System.out.println("Pizzería Bella Napoli");
        System.out.println("Seleccione el tipo de pizza:");
        System.out.println("1. Vegetariana");
        System.out.println("2. No vegetariana");

        int opcionPizza = entrada.nextInt();
        entrada.nextLine();

        if (opcionPizza == 1) {
            tipoPizza = "Vegetariana";

            System.out.println("Ingredientes vegetarianos:");
            System.out.println("a. Pimiento");
            System.out.println("b. Tofu");

            System.out.print("Seleccione un ingrediente: ");
            String opcionIngrediente = entrada.nextLine();

            if (opcionIngrediente.equalsIgnoreCase("a")) {
                ingrediente = "Pimiento";
            } else if (opcionIngrediente.equalsIgnoreCase("b")) {
                ingrediente = "Tofu";
            }

        } else if (opcionPizza == 2) {
            tipoPizza = "No vegetariana";

            System.out.println("Ingredientes no vegetarianos:");
            System.out.println("a. Peperoni");
            System.out.println("b. Jamón");
            System.out.println("c. Salmón");

            System.out.print("Seleccione un ingrediente: ");
            String opcionIngrediente = entrada.nextLine();

            if (opcionIngrediente.equalsIgnoreCase("a")) {
                ingrediente = "Peperoni";
            } else if (opcionIngrediente.equalsIgnoreCase("b")) {
                ingrediente = "Jamón";
            } else if (opcionIngrediente.equalsIgnoreCase("c")) {
                ingrediente = "Salmón";
            }
        }

        System.out.println("\n--- Pedido ---");
        System.out.println("Tipo de pizza: " + tipoPizza);
        System.out.println("Ingredientes: Mozzarella, Tomate y " + ingrediente);

        entrada.close();
    }
}