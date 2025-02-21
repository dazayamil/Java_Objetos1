package Extra.Colecciones.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ExamplePractice {
    public static void main(String[] args) {
        // Crear diferentes tipos de listas
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("=== Comparación de ArrayList y LinkedList ===");

        // Medir tiempo de operaciones
        long inicio = System.nanoTime();

        // Operaciones con ArrayList
        for (int i = 0; i < 100; i++) {
            arrayList.add("Elemento " + i);
        }

        long tiempoArrayList = System.nanoTime() - inicio;

        inicio = System.nanoTime();

        // Operaciones con LinkedList
        for (int i = 0; i < 100; i++) {
            linkedList.add("Elemento " + i);
        }

        long tiempoLinkedList = System.nanoTime() - inicio;

        System.out.println("\nTiempo de inserción:");
        System.out.println("ArrayList: " + tiempoArrayList + " ns");
        System.out.println("LinkedList: " + tiempoLinkedList + " ns");

        // Demostrar diferentes operaciones
        System.out.println("\nOperaciones específicas:");

        linkedList.addFirst("Primero");
        linkedList.addLast("Último");

        System.out.println("Primer elemento de LinkedList: " + linkedList.getFirst());
        System.out.println("Último elemento de LinkedList: " + linkedList.getLast());

        // Demostrar iteración
        System.out.println("\nIteración sobre los primeros 5 elementos:");

        System.out.println("ArrayList:");
        for (int i = 0; i < 5 && i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("\nLinkedList:");
        Iterator<String> iterator = linkedList.iterator();
        for (int i = 0; i < 5 && iterator.hasNext(); i++) {
            System.out.println(iterator.next());
        }
    }
}
