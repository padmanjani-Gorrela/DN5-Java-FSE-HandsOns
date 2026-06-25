public class CustomerService {

    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(int id) {

        Customer customer = repository.findCustomerById(id);

        System.out.println("========== Customer Details ==========");
        System.out.println("Customer ID   : " + customer.getId());
        System.out.println("Name          : " + customer.getName());
        System.out.println("Email         : " + customer.getEmail());
        System.out.println("City          : " + customer.getCity());
        System.out.println("======================================");

    }

}