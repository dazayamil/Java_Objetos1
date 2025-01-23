package MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Seller extends User{
    private List<Product> products;
    public Seller(String name, String address){
        super(name, address);
        this.products = new ArrayList<>();
    }
}
