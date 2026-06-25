public class ProxyTest {

    public static void main(String[] args) {

        Image image1 = new ProxyImage("Vacation_Photo.jpg");

        System.out.println("Image selected.");

        System.out.println("\nFirst Display:");
        image1.display();

        System.out.println("\nSecond Display:");
        image1.display();
    }
}