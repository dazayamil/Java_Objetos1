package MercadoDeObjetos;

import java.util.*;
import java.util.stream.Collectors;

public class Client extends User{
    private List<Order> orders;

    public Client(String name, String address){
        super(name, address);
        this.orders = new ArrayList<>();
    }

    public boolean crearPedido(PaymentMethod payment, ShippingMethod shipping, Product product, int quantity){
        if(product.stockProduct(quantity)){
            Order order = new Order(this, product, quantity, payment, shipping);
            this.orders.add(order);
            return true;
        }
        return false;
    }

    public List<Order> sortedOrders(){
        return this.orders.stream()
                .sorted(Comparator.comparing(order -> order.getProduct().getCategory()))
                .collect(Collectors.toList());
    }

    private Map<String, Integer> cantidadPorCategoria(){
        return this.sortedOrders().stream()
                .collect(Collectors.groupingBy(
                        order -> order.getProduct().getCategory(),
                        LinkedHashMap::new,
                        Collectors.summingInt(order -> order.getProduct().getAvailableQuantity())
                ));
    }

    public String mostrarCantidadPedidosPorCategoria(){
        StringBuilder aux = new StringBuilder();
        this.cantidadPorCategoria().forEach((category, quantity) -> aux.append("Category: ").append(category).append(" - Quantity: ").append(quantity).append("\n"));
        return aux.toString();
    }


}
