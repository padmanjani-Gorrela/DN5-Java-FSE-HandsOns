public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(108, "Keyboard", "Electronics"),
                new Product(102, "Watch", "Accessories"),
                new Product(110, "Mobile", "Electronics")

        };

        System.out.println("===== Linear Search =====");

        Product product =
                SearchOperations.linearSearch(products,108);

        if(product != null){

            System.out.println(product);

        }

        else{

            System.out.println("Product Not Found");

        }

        SearchOperations.sortProducts(products);

        System.out.println("\n===== Binary Search =====");

        product =
                SearchOperations.binarySearch(products,108);

        if(product != null){

            System.out.println(product);

        }

        else{

            System.out.println("Product Not Found");

        }

    }

}