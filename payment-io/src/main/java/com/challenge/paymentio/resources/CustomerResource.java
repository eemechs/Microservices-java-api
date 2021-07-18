package com.challenge.paymentio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.paymentio.entities.Customer;
import com.challenge.paymentio.repositories.CustomerRepository;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {

	@Autowired
	private CustomerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Customer>> findAll(){
		List<Customer> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Customer> findById(@PathVariable Long id){
		Customer obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}

}
