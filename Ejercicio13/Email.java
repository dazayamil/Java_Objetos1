package Ejercicio13;

import java.util.List;
import java.util.ArrayList;

public class Email {
    private String titulo;
    private String cuerpo;
    private List<Archivo> adjuntos;

    public Email() {
    }

    public Email(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.adjuntos = new ArrayList();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getCuerpo() {
        return this.cuerpo;
    }

    public List<Archivo> getAdjuntos() {
        return this.adjuntos;
    }

    public boolean buscarTexto(String texto) {
        return this.titulo.contains(texto) || this.cuerpo.contains(texto);
    }

    private int sumaAdjuntos() {
        return this.adjuntos.stream().mapToInt(Archivo::tamanio).sum();
    }

    public int tamanioEmail() {
        return this.titulo.length() + this.cuerpo.length() + this.sumaAdjuntos();
    }
}
