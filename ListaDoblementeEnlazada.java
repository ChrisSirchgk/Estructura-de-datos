public class ListaDoblementeEnlazada {

    Nodo inicio;
    Nodo fin;

    public ListaDoblementeEnlazada() {
        inicio = null;
        fin = null;
    }

    // Agregar al final
    public void agregarFinal(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }

    // Agregar al inicio
    public void agregarInicio(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
    }

    // Recorrido hacia adelante
    public void recorrerAdelante() {
        Nodo aux = inicio;

        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente;
        }

        System.out.println();
    }

    // Recorrido hacia atrás
    public void recorrerAtras() {
        Nodo aux = fin;

        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.anterior;
        }

        System.out.println();
    }

    // Buscar un dato
    public void buscar(String dato) {
        Nodo aux = inicio;
        int posicion = 1;

        while (aux != null) {
            if (aux.dato.equals(dato)) {
                System.out.println("Dato encontrado en la posición " + posicion);
                return;
            }
            aux = aux.siguiente;
            posicion++;
        }

        System.out.println("Dato no encontrado.");
    }

    // Modificar un dato
    public void modificar(String viejo, String nuevo) {
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.dato.equals(viejo)) {
                aux.dato = nuevo;
                System.out.println("Dato modificado.");
                return;
            }
            aux = aux.siguiente;
        }

        System.out.println("Dato no encontrado.");
    }

    // Eliminar un nodo
    public void eliminar(String dato) {

        Nodo aux = inicio;

        while (aux != null) {

            if (aux.dato.equals(dato)) {

                // Solo un nodo
                if (inicio == fin) {
                    inicio = null;
                    fin = null;
                }
                // Primer nodo
                else if (aux == inicio) {
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                }
                // Último nodo
                else if (aux == fin) {
                    fin = fin.anterior;
                    fin.siguiente = null;
                }
                // Nodo intermedio
                else {
                    aux.anterior.siguiente = aux.siguiente;
                    aux.siguiente.anterior = aux.anterior;
                }

                System.out.println("Nodo eliminado.");
                return;
            }

            aux = aux.siguiente;
        }

        System.out.println("Dato no encontrado.");
    }
}