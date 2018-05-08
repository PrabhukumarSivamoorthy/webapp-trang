package pvt.prahbu.web.services;

import pvt.prabhu.web.pojo.Customer;

public class CustomerService {

	public CustomerService() {
		super();
	}
	
	public Customer getCustomer(int id) {
		
		if(id ==1) {
			Customer cust =  new Customer("Prabhu", "Prabhu", "prabhu", "siva", 23,456,101);
			 cust.setCid(1);
			 return cust;
		}else {if(id ==2) {
			Customer cust2 = new Customer("kumar", "Kumar", "Kumar", "siva", 23,456,101);
			cust2.setCid(2);
			 return cust2;
		}
		}
		return null;
	}

}
