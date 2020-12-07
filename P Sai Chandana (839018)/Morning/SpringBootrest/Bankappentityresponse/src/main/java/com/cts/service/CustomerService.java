package com.cts.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Exception.CustomerNotFoundException;
import com.cts.dao.Customer;
import com.cts.dao.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository dao;
	public Customer addCustomer(Customer customer) {
		//customer.setCustomerID(new Double(Math.random()*1000).intValue());
		Customer createdCustomer = dao.save(customer);
		return createdCustomer;
	}
	public List<Customer> fetchCustomers(){
		List<Customer> customers = dao.findAll();
		return customers;
	}
	public Customer fetcCustomer(int id) throws CustomerNotFoundException {
		Optional<Customer> customer = dao.findById(id);
		if(customer.isPresent())
			return customer.get();
		else
			throw new CustomerNotFoundException("Sorry Customer with an id "+id+" not found");
	}
	public Customer updateCustomer(int id,LocalDate dob) throws CustomerNotFoundException {
		Customer customer = fetcCustomer(id);
			customer.setDob(dob);
			return dao.save(customer);
		}
	public void deleteCustomer(int id) throws CustomerNotFoundException {
		Customer customer = fetcCustomer(id);
		if(customer!=null)
			dao.deleteById(id);
	}

}
