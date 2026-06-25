public class InventoryTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product laptop =
                new Product(101,
                        "Dell Inspiron",
                        15,
                        65000);

        Product mouse =
                new Product(102,
                        "Wireless Mouse",
                        50,
                        1200);

        Product keyboard =
                new Product(103,
                        "Mechanical Keyboard",
                        25,
                        3500);

        inventory.addProduct(laptop);
        inventory.addProduct(mouse);
        inventory.addProduct(keyboard);

        System.out.println();

        inventory.displayProducts();

        inventory.updateProduct(102,60,1300);

        System.out.println();

        inventory.deleteProduct(101);

        System.out.println();

        inventory.displayProducts();

    }
}