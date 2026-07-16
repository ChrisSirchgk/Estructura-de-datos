public class MetodoRecursivo {

    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}