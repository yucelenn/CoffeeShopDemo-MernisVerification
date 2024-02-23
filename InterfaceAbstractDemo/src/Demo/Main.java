package Demo;

import java.time.LocalDate;

import Demo.Abstract.BaseCustomerManager;
import Demo.Adapters.MernisServiceAdapter;
import Demo.Concrete.StarbucksCustomerManager;
import Demo.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		//Kahve dükkanları için yönetim sistemi. Dükkanlar müşterilerini veritabanına kaydedecek. 
		//Starbucks müşterilerini veritabanına kaydederken mernis doğrulaması istiyor.
		//Nero istemiyor.

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
		customerManager.save(new Customer(1, "Yücelen", "Üstün", LocalDate.of(1991,11,29), "11111111111"));
	
	}

}
