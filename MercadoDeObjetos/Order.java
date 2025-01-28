package MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private List<Product> products;

    public Order(Client client){
        this.client = client;
        this.products = new ArrayList<>();
    }
}
