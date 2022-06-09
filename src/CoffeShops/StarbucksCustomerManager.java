package CoffeShops;

import customerPackage.Customer;
import customerPackage.CustomerCheckService;
import customerPackage.CustomerManager;

public class StarbucksCustomerManager extends CustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.checkCustomer(customer))
            super.save(customer);
        else
            throw new Exception("Böyle bir insan yok.");
    }

    public CustomerCheckService getCustomerCheckService() {
        return customerCheckService;
    }
}
