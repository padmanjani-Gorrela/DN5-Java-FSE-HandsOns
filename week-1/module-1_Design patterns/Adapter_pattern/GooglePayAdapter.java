public class GooglePayAdapter implements PaymentProcessor {

    private GooglePayGateway gateway;

    public GooglePayAdapter() {
        gateway = new GooglePayGateway();
    }

    @Override
    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }
}