package Ejercicio6;

import java.time.LocalDate;

public class Mamifero {
    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero madre;
    private Mamifero padre;

    public Mamifero(String identificador) {
        this.identificador = identificador;
    }

    public Mamifero() {
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        if (this.padre == null && this.madre == null) {
            return false;
        } else if (this.padre != unMamifero && this.madre != unMamifero) {
            boolean ancestrosPadre = this.padre == null ? false : this.padre.tieneComoAncestroA(unMamifero);
            boolean ancestrosMadre = this.madre == null ? false : this.madre.tieneComoAncestroA(unMamifero);
            return ancestrosPadre || ancestrosMadre;
        } else {
            return true;
        }
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public String getEspecie() {
        return this.especie;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public Mamifero getPadre() {
        return this.padre;
    }

    public Mamifero getMadre() {
        return this.madre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getAbueloMaterno() {
        return this.madre == null ? null : this.madre.getPadre();
    }

    public Mamifero getAbuelaMaterna() {
        return this.madre == null ? null : this.madre.getMadre();
    }

    public Mamifero getAbueloPaterno() {
        return this.padre == null ? null : this.padre.getPadre();
    }

    public Mamifero getAbuelaPaterna() {
        return this.padre == null ? null : this.padre.getMadre();
    }
}
