package com.cts.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Exception.CustomerNotFoundException;
import com.cts.dao.Customer;
import com.cts.service.CustomerService;
import com.cts.util.ResponseMessage;

@Controller
@RequestMapping("/customerwithRM")
@RestController
public class CustomerControllerwithResponseEntityClass {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public Customer createCustomerAPI(@RequestBody Customer customer) {
		Customer createdCustomer = customerService.addCustomer(customer);
		return createdCustomer;
	}
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerService.fetchCustomers();
	}
	@GetMapping("{customerId}")
	public ResponseEntity<Object> getCustomer(@PathVariable("customerId") int id) {
		ResponseEntity<Object> response = null;
		try {
			Customer customer = customerService.fetcCustomer(id);
			response = ResponseEntity.status(200).body(customer);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}
	@PutMapping("{customerId}/{dob}")
	public ResponseEntity<Object> updateCustomerDobAPI(@PathVariable("customerId") int id,@PathVariable("dob") String stringdob) {
		ResponseEntity<Object> response = null;	
		try {
			Customer customer = customerService.updateCustomer(id, LocalDate.parse(stringdob));
			response = ResponseEntity.status(200).body(customer);
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}
	@DeleteMapping("{customerId}")
	public ResponseEntity<Object> deleteCustomerbyId(@PathVariable("customerId") int id) {
		ResponseEntity<Object> response = null;	
		
		try {
			customerService.deleteCustomer(id);
			response = ResponseEntity.status(404).body("success");
		} catch (CustomerNotFoundException e) {
			ResponseMessage error = new ResponseMessage();
			error.setStatusCode(404);
			error.setDescription(e.getMessage());
			response = ResponseEntity.status(404).body(error);
		}
		return response;
	}
}
