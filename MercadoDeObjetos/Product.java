package MercadoDeObjetos;

public class Product {
    private String name;
    private String category;
    private double price;
    private int availableQuantity;

    public Product(String name, String category, double price, int availableQuantity){
        this.name = name;
        this.category = category;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
}
