package Extra.Colecciones.List.SistemaGestionBiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    private List<Libro> filtrarLibros(Predicate<Libro> criterio){
        return this.libros.stream()
                .filter(criterio)
                .collect(Collectors.toList());
    }


    public List<Libro> librosPorTitulo(String titulo){
        return this.filtrarLibros(l -> l.getTitulo().equals(titulo));
    }

    public List<Libro> libroPorAutor(String autor){
        return this.filtrarLibros(l -> l.getAutor().equals(autor));
    }

}
