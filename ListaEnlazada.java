public class ListaEnlazada {

    Nodo cabeza;

    // Agregar nodo al final
    public void agregarFinal(String dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

            while (actual.siguienteNodo != null) {
                actual = actual.siguienteNodo;
            }

            actual.siguienteNodo = nuevo;
        }

        System.out.println("Se agregó el dato: " + dato);
    }

    // Recorrer la lista
    public void recorrido() {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        int contador = 1;

        while (actual != null) {

            if (actual.siguienteNodo != null) {

                System.out.println(
                        "El nodo " + contador +
                        " contiene el dato " + actual.dato +
                        " y el siguiente nodo es " +
                        actual.siguienteNodo.dato);

            } else {

                System.out.println(
                        "El nodo " + contador +
                        " contiene el dato " + actual.dato +
                        " y no tiene siguiente nodo");
            }

            actual = actual.siguienteNodo;
            contador++;
        }
    }

    // Buscar un dato
    public void buscar(String dato) {

        Nodo actual = cabeza;
        int posicion = 1;

        while (actual != null) {

            if (actual.dato.equals(dato)) {
                System.out.println("El dato '" + dato + "' se encontró en el nodo " + posicion);
                return;
            }

            actual = actual.siguienteNodo;
            posicion++;
        }

        System.out.println("El dato '" + dato + "' no existe en la lista.");
    }

    // Actualizar un dato
    public void actualizar(String datoAnterior, String datoNuevo) {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato.equals(datoAnterior)) {
                actual.dato = datoNuevo;
                System.out.println("Dato actualizado correctamente.");
                return;
            }

            actual = actual.siguienteNodo;
        }

        System.out.println("No se encontró el dato '" + datoAnterior + "'.");
    }

    // Eliminar un nodo
    public void eliminar(String dato) {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Si el primer nodo es el que se elimina
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguienteNodo;
            System.out.println("Dato eliminado correctamente.");
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguienteNodo != null) {

            if (actual.siguienteNodo.dato.equals(dato)) {
                actual.siguienteNodo = actual.siguienteNodo.siguienteNodo;
                System.out.println("Dato eliminado correctamente.");
                return;
            }

            actual = actual.siguienteNodo;
        }

        System.out.println("No se encontró el dato '" + dato + "'.");
    }

}