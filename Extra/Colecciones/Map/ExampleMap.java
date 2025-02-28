package Extra.Colecciones.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleMap {
    public static void main(String[] args) {
        /*Map: Este tipo de coleccion es recomendable usar cuando necesitamos pares como clave y valor, Todo se maneja por clave
       Lo podemos tomar como un diccionario, donde cada palabra tiene su definicion, guarda pares de valores(clave -> valor)
       Las claves son unicas, perfecto su uso para buscar valores por su clave.

       * Cuando Usar Map:
       1) Asociaiones Clave-Valor, 2) Cache y memorizacion, 3) Conteo y Agrupacion, 4) Indice y Busqueda.

       *Implementaciones:
        * HashMap: La mas usada, mejor rendimiento general, no garantiza orden
        * TreeMap: Mantiene claves ordenadas, basado en arbol rojo-negro, util para rangos ordenados
        * LinkedHashMap: Mantiene orden de insercion, mayor uso de memoria y rendimiento similar a HashMap
        * ConcurrentHashMap: Alto rendimiento en concurrencia, no permite Null, operaciones atomicas.
        */

        //Declaracion Basica de un Map
        Map<String, Integer> edades = new HashMap<>();

        //Agregar Elementos
        edades.put("Juan", 25);
        edades.put("Maria", 28);
        edades.put("Carlos", 30);
        edades.put("Juan", 25); //Permite duplicados

        //Obtener un valor
        int edadJuan = edades.get("Juan"); //return 25

        //Verificar si existe una clave
        boolean existeMaria = edades.containsKey("Maria"); //return TRUE

        // Verificar si existe un valor
        boolean existe30 = edades.containsValue(30);  // true

        // Valor por defecto si no existe la clave
        int edadPedro = edades.getOrDefault("Pedro", 0);  // 0

        // Actualizar un valor
        edades.replace("Juan", 26);

        // Actualizar o insertar
        edades.put("Juan", 27);  // Si existe, actualiza; si no, inserta

        // Eliminar una entrada
        edades.remove("Carlos");

        // Tamaño del map
        System.out.println(edades.size());  // 2

        // Obtener todas las claves
        Set<String> nombres = edades.keySet();

        // Obtener todos los valores
        Collection<Integer> todasLasEdades = edades.values();

        // Obtener pares clave-valor
        Set<Map.Entry<String, Integer>> entradas = edades.entrySet();

        // Iterar sobre un Map
        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}