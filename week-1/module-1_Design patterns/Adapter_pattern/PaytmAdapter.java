public class PaytmAdapter implements PaymentProcessor {

    private PaytmGateway gateway;

    public PaytmAdapter() {
        gateway = new PaytmGateway();
    }

    @Override
    public void processPayment(double amount) {
        gateway.pay(amount);
    }

}