package com.challenge.paymentio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.paymentio.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
