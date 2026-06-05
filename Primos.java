public class Primos {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 100; numero++) {

            boolean esPrimo = true;

            if (numero <= 1) {
                esPrimo = false;
            } else {

                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(numero);
            }
        }
    }
}