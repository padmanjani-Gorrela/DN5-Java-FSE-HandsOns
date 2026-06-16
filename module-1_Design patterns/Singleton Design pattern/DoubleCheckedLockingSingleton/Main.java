package DoubleCheckedLockingSingleton;

public class Main {

    public static void main(String[] args) {

        DoubleCheckedLockingSingleton obj1 = DoubleCheckedLockingSingleton.getInstance();

        DoubleCheckedLockingSingleton obj2 = DoubleCheckedLockingSingleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1 == obj2);
    }
}

// output

// DoubleCheckedLockingSingleton.DoubleCheckedLockingSingleton@7a81197d
// DoubleCheckedLockingSingleton.DoubleCheckedLockingSingleton@7a81197d
// true