package springAppi.service.impl;

import java.util.List;
import java.util.Map;


import springAppi.domain.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();

	void updateAllList();

	List<Customer> getProductsByAdress(String adress);

//	List<Customer> getProductsByFilter(Map<String, List<String>> filterParams);

	Customer getCustomerById(Integer id);

	static void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
