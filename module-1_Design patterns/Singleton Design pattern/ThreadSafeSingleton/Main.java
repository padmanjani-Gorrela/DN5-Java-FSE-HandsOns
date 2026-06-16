package ThreadSafeSingleton;

public class Main {

    public static void main(String[] args) {

        ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2);
    }
}

// output:

// ThreadSafeSingleton.ThreadSafeSingleton@7a81197d
// ThreadSafeSingleton.ThreadSafeSingleton@7a81197d
// true