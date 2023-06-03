package com.d3vshub.repository;

import com.d3vshub.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    Delivery findById(int id);
    List<Delivery> findAll();
}