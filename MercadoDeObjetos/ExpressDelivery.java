package MercadoDeObjetos;

public class ExpressDelivery implements ShippingMethod{
    @Override
    public String getDescription() {
        return "Express a domicilio";
    }
}
