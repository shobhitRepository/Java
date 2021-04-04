package com.shobhit.learntocode.springbootexplore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shobhit.learntocode.springbootexplore.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
