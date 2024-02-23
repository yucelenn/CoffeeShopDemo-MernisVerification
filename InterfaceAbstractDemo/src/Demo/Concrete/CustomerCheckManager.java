package Demo.Concrete;

import Demo.Abstract.CustomerCheckService;
import Demo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		//MernisServiceReferance.KPSPublicSoapClient client;

		return true;
	}

}
