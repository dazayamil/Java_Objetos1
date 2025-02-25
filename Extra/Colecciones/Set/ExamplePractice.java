package Extra.Colecciones.Set;

import java.util.*;

import Extra.Colecciones.Set.Persona;

public class ExamplePractice {
    public static void main(String[] args) {
        System.out.println("========= HashSet ===========");
        HashSet<String> hashSet = new HashSet<>();

        //Agregando Elementos
        hashSet.add("Manzana");
        hashSet.add("Banana");
        hashSet.add("Naranja");
        hashSet.add("Manzana"); //No se agregara por ser duplicado.

        System.out.println(hashSet); //NO se garantiza el orden de los elementos agregados

        //Operaciones comunes
        System.out.println("Contiene 'Manzana': " + hashSet.contains("Manzana"));
        System.out.println("Tamaño: " + hashSet.size());
        hashSet.remove("Banana");
        System.out.println("Despues de Eliminar Banana: " + hashSet);

        // ============= LinkedHashSet ===============
        System.out.println("======== LinkedHashSet ==========");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Rojo");
        linkedHashSet.add("Verde");
        linkedHashSet.add("Azul");
        linkedHashSet.add("Rojo"); // No se agregara - NO se aceptan duplicados
        System.out.println(linkedHashSet);

        //Eliminacion y demostracion de Orden:
        linkedHashSet.remove("Verde");
        linkedHashSet.add("Verde");
        System.out.println("Despues de eliminar y agregar 'Verde' : " + linkedHashSet);

        // ============= TreeSet ===============
        System.out.println("======== TreeSet ==========");
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Zebra");
        treeSet.add("Leon");
        treeSet.add("Jirafa");

        System.out.println(treeSet); //Orden Natural

        //Operaciones:
        System.out.println("primer Elemento: " + treeSet.first());
        System.out.println("ultimo Elemento: " + treeSet.last());
        System.out.println("Elemento antes que 'Leon' " + treeSet.lower("Leon"));
        System.out.println("Elemento despues de 'Leon' " + treeSet.higher("Leon"));

        //Ejemplos con objetos
        TreeSet<Persona> personas = new TreeSet<>();

        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Carlitos", 20));

        System.out.println("Personas ordenadas por edad: ");
        for (Persona p: personas){
            System.out.println(p);
        }

        // Ejemplo de uso Practico de HashSet para eliminar duplicados
        List<String> listaConDuplicados = Arrays.asList("A","B","C","A","B");
        HashSet<String> sinDuplicados = new HashSet<>(listaConDuplicados);
        System.out.println("Lista Original: " + listaConDuplicados);
        System.out.println("Sin Duplicados: " + sinDuplicados);

    }
}
