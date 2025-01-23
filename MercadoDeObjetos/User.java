package MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected String name;
    protected String address;

    public User(String name, String address){
        this.name = name;
        this.address = address;
    }
}

