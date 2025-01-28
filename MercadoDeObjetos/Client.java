package MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Client extends User{
    private List<Order> orders;

    public Client(String name, String address){
        super(name, address);
        this.orders = new ArrayList<>();
    }
}
