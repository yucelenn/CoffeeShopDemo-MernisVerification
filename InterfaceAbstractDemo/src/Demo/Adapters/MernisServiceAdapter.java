package Demo.Adapters;

import java.rmi.RemoteException;

import Demo.Abstract.CustomerCheckService;
import Demo.Entities.Customer;
import MernisServiceReferance.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		 boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth().getYear());
		 
		 if(result == true){
				System.out.print("Successfully ");
				return true;
				
			}else {
				System.out.println("Failed");
				return false;
			}
		 
	}

}
