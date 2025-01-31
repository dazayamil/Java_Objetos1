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

    public String getCategory() {
        return this.category;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public boolean stockProduct(int quantity){
        if(this.availableQuantity >= quantity){
            int finalAmount = this.availableQuantity - quantity;
            this.setAvailableQuantity(finalAmount);
            return true;
        }
        return false;
    }

}
