package Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
    private String nombre;
    private List<Email> emails;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.emails = new ArrayList();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarEmail(Email email) {
        this.emails.add(email);
    }

    public void mover(Email email, Carpeta destino) {
        destino.agregarEmail(email);
        this.emails.remove(email);
    }

    public Email buscarEmail(String texto) {
        return (Email)this.emails.stream().filter((email) -> {
            return email.buscarTexto(texto);
        }).findFirst().orElse((Email) null);
    }

    public int tamanioCarpeta() {
        return this.emails.stream().mapToInt((email) -> {
            return email.tamanioEmail();
        }).sum();
    }
}
