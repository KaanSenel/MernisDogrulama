package mernisCheck;

import customerPackage.Customer;
import customerPackage.CustomerCheckService;
import mernisConfirmation.KCOKPSPublicSoap;

public class MernisCheckManager implements CustomerCheckService {

    @Override
    public boolean checkCustomer(Customer customer) throws Exception {


       KCOKPSPublicSoap client=new KCOKPSPublicSoap();
       return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(),
               customer.getLastName().toUpperCase(), customer.getBirthdayYear());
    }
}
