public class DecoratorTest {

    public static void main(String[] args) {

        System.out.println("----- Email Only -----");

        Notifier email = new EmailNotifier();
        email.send("Assignment Submitted");

        System.out.println();

        System.out.println("----- Email + SMS -----");

        Notifier sms = new SMSNotifierDecorator(new EmailNotifier());
        sms.send("Assignment Submitted");

        System.out.println();

        System.out.println("----- Email + SMS + WhatsApp -----");

        Notifier all = new WhatsAppNotifierDecorator(
                            new SMSNotifierDecorator(
                                new EmailNotifier()));

        all.send("Assignment Submitted");

    }

}