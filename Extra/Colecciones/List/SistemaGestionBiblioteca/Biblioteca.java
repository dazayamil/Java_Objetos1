package Extra.Colecciones.List.SistemaGestionBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    private Libro buscarLibro(String dato){
        return this.libros.stream()
                .filter( l -> l.getIsbn().equals(dato))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminarLibro(String isbn){
        //Verificar que ISBN sea Valido
        if(isbn == null || isbn.trim().isEmpty()){
            System.out.println("El ISBN proporcionado no es valido");
            return false;
        }

        boolean fueEliminado = this.libros.removeIf(libro -> libro.getIsbn().equals(isbn));
        return fueEliminado; //TRUE: se elimino - FALSE: no se elimino o ISBN invalido
    }

}
