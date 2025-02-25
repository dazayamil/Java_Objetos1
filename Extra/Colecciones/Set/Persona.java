package Extra.Colecciones.Set;

public class Persona implements Comparable<Persona>{
    private String name;
    private int age;

    public Persona(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        // Ordenar por edad de menor a mayor
        return Integer.compare(this.age, otraPersona.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " años)";
    }
}
