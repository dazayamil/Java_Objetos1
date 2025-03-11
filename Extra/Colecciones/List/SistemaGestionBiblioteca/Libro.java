package Extra.Colecciones.List.SistemaGestionBiblioteca;

//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
public class Libro {
    private String isbn;
    //@NotNull
    //@Size(min = 5, max = 20)
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
