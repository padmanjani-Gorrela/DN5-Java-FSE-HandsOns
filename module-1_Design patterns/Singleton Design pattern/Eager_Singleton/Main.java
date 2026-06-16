package Eager_Singleton;

public class Main {

    public static void main(String[] args) {

        EagerSingleton obj1 = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2);
    }
}