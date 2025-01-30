package MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Client extends User{
    private List<Order> orders;

    public Client(String name, String address){
        super(name, address);
        this.orders = new ArrayList<>();
    }

    public boolean crearPedido(PaymentMethod paymentMethod, ShippingMethod shippingMethod, Product product, int quantity){
        if(product.stockProduct(quantity)){
            Order order = new Order(this, product, quantity, paymentMethod, shippingMethod);
            this.orders.add(order);
            return true;
        }
        return false;
    }
}
