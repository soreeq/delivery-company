package com.d3vshub.repository;

import com.d3vshub.model.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackingRepository extends JpaRepository<Tracking, Long> {
     Tracking findById(int id);
     List<Tracking> findAll();


}
