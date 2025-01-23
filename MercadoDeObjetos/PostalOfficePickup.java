package MercadoDeObjetos;

public class PostalOfficePickup implements ShippingMethod{
    @Override
    public String getDescription() {
        return "Retirar en Sucursal de Correo";
    }
}
