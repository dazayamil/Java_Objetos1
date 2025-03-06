package Extra.Reflection;

public class Persona {
    private String name;

    public Persona(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    private void mostrarMensajePrivado(){
        System.out.println("Hello, I am method private.");
    }
}
