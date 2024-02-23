package Demo.Abstract;

import java.rmi.RemoteException;

import Demo.Entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
