package MercadoDeObjetos;

public class InstallmentPayment implements PaymentMethod{
    private static final int MAX_INSTALLMENTS = 6;

    @Override
    public String getDescription() {
        return "Payment in installments";
    }
}
