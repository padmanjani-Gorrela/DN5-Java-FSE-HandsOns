public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext payment = new PaymentContext(new CreditCardPayment());

        System.out.println("Order Amount : ₹2500");
        payment.makePayment(2500);

        payment.setPaymentStrategy(new UpiPayment());

        System.out.println("\nOrder Amount : ₹1800");
        payment.makePayment(1800);

        payment.setPaymentStrategy(new NetBankingPayment());

        System.out.println("\nOrder Amount : ₹4200");
        payment.makePayment(4200);

    }

}