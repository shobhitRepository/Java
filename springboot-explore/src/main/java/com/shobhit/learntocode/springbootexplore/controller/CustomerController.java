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

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public List<Customer> findAll(){
		log.info("find all customers");
		return customerService.findAll();
	}
	@GetMapping("/{id}")
	public Optional<Customer> findById(@PathVariable("id") Long id){
		log.info("find by id customers");
		return customerService.findById(id);
	}
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		log.info("save all customers");
		return customerService.saveCustomer(customer);
	}
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		log.info("update by id customers");
		return customerService.updateCustomer(customer);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable("id") Long id) {
		log.info("Delete by id customers");
		customerService.DeleteCustomer(id);
		return "deleted id "+ id;
	}
}
