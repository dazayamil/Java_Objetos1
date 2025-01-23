package MercadoDeObjetos;

public class CashPayment implements PaymentMethod{
    @Override
    public String getDescription() {
        return "Cash Payment";
    }
}
