public class WhatsAppNotifierDecorator extends NotifierDecorator {

    public WhatsAppNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("WhatsApp Notification : " + message);
    }

}