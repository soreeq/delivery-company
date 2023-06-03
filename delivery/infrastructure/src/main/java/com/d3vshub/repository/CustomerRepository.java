package com.d3vshub.repository;

import com.d3vshub.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findById(int id);
    List<Customer> findAll();
}
