package Demo.Concrete;

import Demo.Abstract.BaseCustomerManager;
import Demo.Abstract.CustomerCheckService;
import Demo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) throws Exception {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new Exception("Not a valid person!");
		}
	}

}
