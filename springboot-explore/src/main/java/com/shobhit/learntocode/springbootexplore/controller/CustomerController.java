package com.shobhit.learntocode.springbootexplore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shobhit.learntocode.springbootexplore.entity.Customer;
import com.shobhit.learntocode.springbootexplore.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public List<Customer> findAll(){
		return customerService.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Customer> findById(@PathVariable("id") Long id){
		return customerService.findById(id);
	}
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	@DeleteMapping("/delete/{id}")
	public String updateCustomer(@PathVariable("id") Long id) {
		customerService.DeleteCustomer(id);
		return "deleted id "+ id;
	}
}
