package Extra.Colecciones.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ExampleList {

    /*LIST: mantienen el orden de insercion y permiten elementos duplicados, acceso por indice(directo)
    Cuando usar esto: Cuando queremos mantener un orden,acceder por posicion y que no importe tener duplicados

    * ArrayList -> Mejor para acceso aleatorio y almacenamiento, basado en array dinamico,
        bueno para Iteracion, lento para eliminacion y/o insercion.
    * LinkedList -> Mejor para insercion/eliminacion frecuente, mejor uso en manipulacion de datos.
        lento en acceso aleatorio
    * Vector -> Mejor para busqueda directa
    * */
    public static void main(String[] args) {
        //ArrayList: Acceso rapido por indice
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Primero");
        arrayList.add("Segundo");
        arrayList.add("Segundo"); //Permite Duplicados

        //Operaciones:
        arrayList.add("elemento"); //Agregar al final
        arrayList.add(0, "elemento"); //Agregar en un indice
        arrayList.get(0); // Obtener elemento de una posicion
        arrayList.set(0, "new"); //Modificar elemento en una posicion
        arrayList.remove(0); //Eliminar elemento por indice
        arrayList.remove("Objeto"); //Eliminar Objeto
        arrayList.size(); //Obtener tamaño del arrayList
        arrayList.clear(); //Limpiar lista

        //LinkedList: Insercion/eliminacion rapida
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Uno");
        linkedList.addFirst("Cero"); //Metodo especifico de LinkedList
        linkedList.addLast("Dos");

        //Operaciones:
        //Tiene los metodo de add, addFirst, addLast vistos anteriormente
        linkedList.get(0); //Obtener elemento de una posicion
        linkedList.getFirst(); //Obtener el primer elemento
        linkedList.getLast(); //Obtener el ultimo elemento
        linkedList.remove(0); //Eliminar por indice
        linkedList.removeFirst(); //Eliminar el primer elemento
        linkedList.removeLast(); //Eliminar el ultimo elemento

        //Vector
        Vector<String> vector = new Vector<>();

        //Operaciones comunes:
        vector.add("Elemento"); //agregar al final
        vector.add(0, "Item"); //Agregar por un indice
        vector.get(0); //Obtener elemento por un indice
        vector.remove(0); //Eliminar por un indice
        vector.size(); //Tamaño del vector
        vector.capacity(); //Capacidad del vector
        vector.trimToSize(); //Ajustar capacidad al tamaño
    }
}
