package com.shobhit.learntocode.springbootexplore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shobhit.learntocode.springbootexplore.entity.Customer;
import com.shobhit.learntocode.springbootexplore.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	public Optional<Customer> findById(Long customerId){
		return customerRepository.findById(customerId);
	}
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
	public void DeleteCustomer(Long id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}
}
