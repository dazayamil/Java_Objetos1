package Practice.pokemon;

public class Pokemon {
    private String nombre;
    private int energia;

    public Pokemon(String nombre){
        this.nombre = nombre;
        this.energia = 100;
    }

    private boolean tieneEnergio(){
        return this.energia > 0;
    }

    public void recibirEntrenamiento(){
        if(tieneEnergio()){
            this.energia -= 10;
        }else {
            System.out.println("Pokemon sin energia");
        }
    }
}
