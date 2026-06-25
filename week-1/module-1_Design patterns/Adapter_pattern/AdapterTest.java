public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor googlePay = new GooglePayAdapter();
        PaymentProcessor phonePe = new PhonePeAdapter();
        PaymentProcessor paytm = new PaytmAdapter();

        googlePay.processPayment(2500);
        phonePe.processPayment(1800);
        paytm.processPayment(3200);

    }

}