package com.example.delivery_bd.repository;

import com.example.delivery_bd.dto.DeliveryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryDTO, Integer> {

}
