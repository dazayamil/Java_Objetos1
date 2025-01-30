package MercadoDeObjetos;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private Product product;
    private int quantity;
    private PaymentMethod paymentMethod;
    private ShippingMethod shippingMethod;

    public Order(Client client, Product product, int quantity, PaymentMethod paymentMethod, ShippingMethod shippingMethod){
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
        this.shippingMethod = shippingMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}

