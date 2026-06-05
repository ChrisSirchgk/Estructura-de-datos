public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < 50; i++) {
            int siguiente = a + b;
            System.out.println(siguiente);

            a = b;
            b = siguiente;
        }
    }
}