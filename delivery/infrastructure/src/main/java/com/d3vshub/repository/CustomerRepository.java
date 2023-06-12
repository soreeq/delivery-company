package com.d3vshub.repository;

import com.d3vshub.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findById(int id);
    List<Customer> findAll();

    @Query("SELECT c FROM Customer c WHERE c.first_name = :firstName")
    Customer findByFirst_name(@Param("firstName") String customerName);
}
