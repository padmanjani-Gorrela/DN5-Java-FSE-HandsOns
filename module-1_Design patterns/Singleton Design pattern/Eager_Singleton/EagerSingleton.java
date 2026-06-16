package Eager_Singleton;
public class EagerSingleton {

    private static final EagerSingleton INSTANCE =
            new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}


// Output
// EagerSingleton@7a81197d
// EagerSingleton@7a81197d
// true