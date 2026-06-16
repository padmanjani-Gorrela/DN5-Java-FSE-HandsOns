package BillPughSingleton;

public class Main {

    public static void main(String[] args) {
        BillPughSingleton obj1 = BillPughSingleton.getInstance();
        BillPughSingleton obj2 = BillPughSingleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2);
    }
}