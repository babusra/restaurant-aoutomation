package com.example.restaurantaoutomation.repositories;

import com.example.restaurantaoutomation.model.Firm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirmRepository extends JpaRepository<Firm,Integer> {
    public Iterable<Firm> findAllByFirmNameContaining(String filter);
}
