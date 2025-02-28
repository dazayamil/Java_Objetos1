package Extra.Colecciones.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExampleSet {
    public static void main(String[] args) {
        /*SET: Este tipo de coleccion lo podemos usar cuando no aceptamos duplicados, sino unicos, cuando no nos importa el orden,
        cuando necesitamos busquedas rapidas. Tomar como una caja de Colores sin duplicados y unicos. Permite elementos Null.
        * TIPOS:
        * HASHSET -> Usar cuando no importa el orden de los elementos, necesitamos el mejor rendimiento posible
            para realizar operaciones de busqueda. Ejemplo: Cache de Valores Unicos, eliminar duplicados de una coleccion.
        * LINKEDHASHSET -> Usar cuando se necesite el orden de insercion, realizar iteraciones frecuentes, sacrificar
            algo de memoria por predictibilidad. Ejemplo: Historial de navegacion, menus con orden especifico.
        * TREESET -> Usar cuando necesitas elementos ordenados naturalmente, operaciones de rango(between), el orden
            es mas importes que el rendimiento. Ejemplo: Clasificacion o rankings, diccionario
        */

        //HASH SET -> Declaracion:
        HashSet<String> hashSet = new HashSet<>();

        //Operacion:
        hashSet.add("Elemento"); //Agregar elemento
        hashSet.remove("elemento"); //Eliminar el elemento pasado por parametro
        hashSet.contains("elemento"); //Verficia si el elemento pasado por parametro se encuentra dentro de HashSet
        hashSet.size(); //Tamaño set
        hashSet.clear(); //Limpiar set
        hashSet.isEmpty(); //Verificar si esta vacio

        //LINKEDHASHSET -> Declaracion:
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        //Operaciones:
        linkedHashSet.add("Elemento"); //Agregar elemento.
        linkedHashSet.remove("Elemento"); //Eliminar elemento
        linkedHashSet.contains("Elemento"); //Verificar existencia
        // Metodo Size para saber el tamaño

        //TREESET -> Declaracion:
        TreeSet<String> treeSet = new TreeSet<>();

        //Operaciones:
        // Mas comunes: ADD("ELEMENTO"), REMOVE("ELEMENTO"), CONTAINS()
        treeSet.first(); //Obterner el primer elemento
        treeSet.last(); //Obtener el ultimo elemento
        treeSet.lower("Elemento"); //Obtener elemento anterior
        treeSet.higher("Elemento"); //Obtener elemento siguiente.
    }
}
