package Extra.Colecciones.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class example {

    /*LIST: mantienen el orden de insercion y permiten elementos duplicados
    * ArrayList -> Mejor para acceso aleatorio y almacenamiento
    * LinkedList -> Mejor para insercion/eliminacion frecuente
    * Vector -> Mejor para busqueda directa
    * */
    public static void main(String[] args) {
        //ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Primero");
        arrayList.add("Segundo");
        arrayList.add("Segundo"); //Permite Duplicados

        //LinkedList:
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Uno");
        linkedList.addFirst("Cero"); //Metodo especifico de LinkedList
        linkedList.addLast("Dos");

        //Operaciones Basicas con List
        arrayList.size(); //Obtener tamaño
        arrayList.get(0); //Acceder por indice
        arrayList.remove(1); //Eliminar por indice
        arrayList.contains("primero"); //Verificar si existe dentro de la lista
        arrayList.clear(); //Eliminar todos los elmentos
    }
}
