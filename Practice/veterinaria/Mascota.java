package Practice.veterinaria;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(){}
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void cumplirAnios(){
        this.edad ++;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + this.nombre + '\'' +
                ", especie='" + this.especie + '\'' +
                ", edad=" + this.edad +
                '}';
    }
}
