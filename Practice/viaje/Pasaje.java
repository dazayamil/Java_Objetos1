package Practice.viaje;

import Practice.pokemon.Pokemon;

public class Pasaje {
    private int numeroDeAsiento;
    private int dniPasajero;

    public Pasaje(int numeroDeAsiento, int dniPasajero){
        this.numeroDeAsiento = numeroDeAsiento;
        this.dniPasajero = dniPasajero;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Pasaje other = (Pasaje) obj;
        return this.numeroDeAsiento == other.numeroDeAsiento && this.dniPasajero == other.dniPasajero;
    }
}
