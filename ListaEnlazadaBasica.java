public class ListaEnlazadaBasica {

    public static void main(String[] args) {

        Nodo n1 = new Nodo("A");
        Nodo n2 = new Nodo("B");
        Nodo cabeza = n1;

        n1.siguienteNodo = n2;

        Nodo n3 = new Nodo("C");
        n2.siguienteNodo = n3;

        Nodo n4 = new Nodo("D");
        n3.siguienteNodo = n4;

        Nodo n5 = new Nodo("E");
        n4.siguienteNodo = n5;

        // Recorrer lista
        Nodo actual = cabeza;
        int contador = 1;

        while (actual != null) {

            if (actual.siguienteNodo != null) {
                System.out.println(
                    "El nodo " + contador +
                    " contiene el dato " + actual.dato +
                    " y el siguiente nodo es " +
                    actual.siguienteNodo.dato
                );
            } else {
                System.out.println(
                    "El nodo " + contador +
                    " contiene el dato " + actual.dato +
                    " y no tiene siguiente nodo"
                );
            }

            actual = actual.siguienteNodo;
            contador++;
        }
    }
}