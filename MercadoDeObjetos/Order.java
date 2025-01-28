package MercadoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private Product product;
    private PaymentMethod paymentMethod;
    private ShippingMethod shippingMethod;

    public Order(Client client, PaymentMethod paymentMethod, ShippingMethod shippingMethod, Product product){
        this.client = client;
        this.product = product;
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

