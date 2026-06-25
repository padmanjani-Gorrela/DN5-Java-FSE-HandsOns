public class SortTest {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101,"Rahul",8500),
                new Order(102,"Anjali",3200),
                new Order(103,"Kiran",15000),
                new Order(104,"Sneha",6800),
                new Order(105,"Vikram",5100)

        };

        System.out.println("===== Bubble Sort =====");

        SortOperations.bubbleSort(orders);

        SortOperations.display(orders);

        Order[] quickOrders = {

                new Order(101,"Rahul",8500),
                new Order(102,"Anjali",3200),
                new Order(103,"Kiran",15000),
                new Order(104,"Sneha",6800),
                new Order(105,"Vikram",5100)

        };

        System.out.println("\n===== Quick Sort =====");

        SortOperations.quickSort(
                quickOrders,
                0,
                quickOrders.length - 1);

        SortOperations.display(quickOrders);

    }

}