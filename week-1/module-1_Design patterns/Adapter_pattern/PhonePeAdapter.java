public class PhonePeAdapter implements PaymentProcessor {

    private PhonePeGateway gateway;

    public PhonePeAdapter() {
        gateway = new PhonePeGateway();
    }

    @Override
    public void processPayment(double amount) {
        gateway.sendMoney(amount);
    }

}