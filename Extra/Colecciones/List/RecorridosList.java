package Extra.Colecciones.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RecorridosList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        //FORMAS DE RECORRIDO:
        //1) FOR TRADICIONAL
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + lista.get(i));
        }

        //2) FOR EACH:
        for (String item : lista) {
            System.out.println("Elemento: " + item);
        }

        //3) ITERATOR:
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println("Item: " + iterator.next());
        }

        //4) LAMBGA y FOREACH
        lista.forEach(item -> System.out.println(item));

        //5) STREAM
        lista.stream()
                .forEach(item -> System.out.println(item));
    }
}
