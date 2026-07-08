public class PrincipalListaEnlazada {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        // Agregar nodos
        lista.agregarFinal("A");
        lista.agregarFinal("B");
        lista.agregarFinal("C");
        lista.agregarFinal("D");
        lista.agregarFinal("E");

        System.out.println("\n===== LISTA ORIGINAL =====");
        lista.recorrido();

        System.out.println("\n===== BUSCAR =====");
        lista.buscar("C");
        lista.buscar("X");

        System.out.println("\n===== ACTUALIZAR =====");
        lista.actualizar("C", "Z");
        lista.recorrido();

        System.out.println("\n===== ELIMINAR =====");
        lista.eliminar("D");
        lista.recorrido();
    }
}