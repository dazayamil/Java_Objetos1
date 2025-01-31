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

    public Order(Client client, Product product, int quantity, PaymentMethod payment, ShippingMethod shipping){
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.paymentMethod = payment;
        this.shippingMethod = shipping;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}

