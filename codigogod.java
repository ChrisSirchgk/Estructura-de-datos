public class codigogod {

    // 1. Saludo simple
    public static void saludo() {
        System.out.println("¡Hola amigo!");
    }

    // 2. Saludo con nombre
    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    // 3. Factorial
    public static long factorial(int n) {
        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    // 4. Factura con IVA por defecto (21%)
    public static double facturaTotal(double cantidad) {
        return cantidad + (cantidad * 21 / 100);
    }

    // 4. Factura con IVA personalizado
    public static double facturaTotal(double cantidad, double iva) {
        return cantidad + (cantidad * iva / 100);
    }

    // 5. Área del círculo
    public static double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // 5. Volumen del cilindro
    public static double volumenCilindro(double radio, double altura) {
        return areaCirculo(radio) * altura;
    }

    public static void main(String[] args) {

        // 1
        saludo();

        // 2
        saludar("Chris");

        // 3
        System.out.println("Factorial de 5: " + factorial(5));

        // 4
        System.out.println("Factura con IVA por defecto: " + facturaTotal(100));
        System.out.println("Factura con IVA 10%: " + facturaTotal(100, 10));

        // 5
        System.out.println("Área del círculo: " + areaCirculo(3));
        System.out.println("Volumen del cilindro: " + volumenCilindro(3, 5));
    }
}