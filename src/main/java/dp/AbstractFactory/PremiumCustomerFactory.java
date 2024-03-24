package dp.AbstractFactory;

public class PremiumCustomerFactory implements CustomerFactory{
    @Override
    public Customer createCustomer(String id, String name) {
        return new PremiumCustomer(id, name);
    }
}
