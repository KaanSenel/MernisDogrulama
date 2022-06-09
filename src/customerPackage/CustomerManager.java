package customerPackage;

import customerPackage.Customer;

public abstract class CustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("Veritabanına kaydedildi : "+customer.getFirstName());
    }
}
