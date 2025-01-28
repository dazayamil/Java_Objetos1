package MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Client extends User{
    private List<Order> orders;
    private PaymentMethod paymentMethod;
    private ShippingMethod shippingMethod;
    public Client(String name, String address){
        super(name, address);
        this.orders = new ArrayList<>();
        this.paymentMethod = null;
        this.shippingMethod = null;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}
