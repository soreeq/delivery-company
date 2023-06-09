package com.d3vshub.repository;

import com.d3vshub.model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRepository extends JpaRepository<Courier, Long> {
    Courier findById(int courierId);
    List<Courier> findAll();
}