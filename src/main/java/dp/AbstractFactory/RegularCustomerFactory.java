package dp.AbstractFactory;

public class RegularCustomerFactory implements CustomerFactory {
    @Override
    public Customer createCustomer(String id, String name) {
        return new RegularCustomer(id, name);
    }
}
