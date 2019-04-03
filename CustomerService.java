package com.niit.crm.service;

import java.util.List;

import com.niit.crm.model.Customer;

public interface CustomerService {
	
	public List < Customer > getCustomer();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int theId);
}
