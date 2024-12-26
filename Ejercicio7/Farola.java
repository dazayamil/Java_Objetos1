package Ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Farola {
    private boolean interruptor = false;
    private List<Farola> farolas = new ArrayList();

    public Farola() {
    }

    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }

    public void pairWithNeighbor(Farola otraFarola) {
        this.farolas.add(otraFarola);
        otraFarola.farolas.add(this);
    }

    public List<Farola> getNeighbors() {
        return this.farolas;
    }

    public boolean isOn() {
        return this.interruptor;
    }

    public boolean isOff() {
        return !this.interruptor;
    }

    public void turnOn() {
        if (this.isOff()) {
            this.setInterruptor(true);
            Iterator var1 = this.farolas.iterator();

            while(var1.hasNext()) {
                Farola f = (Farola)var1.next();
                f.turnOn();
            }
        }

    }

    public void turnOff() {
        if (this.isOn()) {
            this.setInterruptor(false);
            Iterator var1 = this.farolas.iterator();

            while(var1.hasNext()) {
                Farola f = (Farola)var1.next();
                f.turnOff();
            }
        }

    }
}
