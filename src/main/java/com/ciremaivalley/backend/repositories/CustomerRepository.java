package com.ciremaivalley.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciremaivalley.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
