package Extra.Colecciones.List.SistemaGestionBiblioteca;

//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
public class Libro {
    //@NotNull
    //@Size(min = 3, max 10)
    private int id;
    //@Size(min = 5, max = 20)
    private String titulo;
    private String autor;
    private boolean disponible;
    private String usuario;

    public Libro(int id, String titulo, String autor){
        //Al instanciar un Libro, siempre estara disponible (TRUE)
        //El libro no sera prestado en 1er instancia por eso usuario en NULL.
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        this.usuario = null;
    }

    public int getId() {
        return this.id;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }

}
