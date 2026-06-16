package BillPughSingleton;

public class BillPughSingleton {

    private BillPughSingleton() {}
    private static class Holder {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance() {
        return Holder.INSTANCE;
    }
}

// output:
// BillPughSingleton.BillPughSingleton@5ca881b5
// BillPughSingleton.BillPughSingleton@5ca881b5
// true