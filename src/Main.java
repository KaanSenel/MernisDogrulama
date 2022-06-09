import CoffeShops.StarbucksCustomerManager;
import customerPackage.Customer;
import customerPackage.CustomerManager;
import mernisCheck.MernisCheckManager;

public class Main {

    public static void main(String[] args) throws Exception {

        CustomerManager customerManager=new StarbucksCustomerManager(new MernisCheckManager());
        Customer customer=new Customer();
        customer.setId(1);
        customer.setFirstName("kaan");
        customer.setLastName("şenel");
        customer.setNationalityId(99999999999L);
        customer.setBirthdayYear(1998);

        customerManager.save(customer);

    }
}
