package MercadoDeObjetos;

public class Client extends User{
    private String pedido;
    public Client(String name, String address){
        super(name, address);
        this.pedido = null;
    }
}
