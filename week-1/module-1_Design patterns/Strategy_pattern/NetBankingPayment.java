
public class NetBankingPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Net Banking.");
    }

}
