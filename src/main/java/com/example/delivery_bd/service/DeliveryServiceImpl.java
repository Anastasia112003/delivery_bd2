package com.example.delivery_bd.service;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.mapstract.DeliveryFactory;
import com.example.delivery_bd.model.Delivery;
import com.example.delivery_bd.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl {
    private final DeliveryFactory deliveryFactory;
    private final DeliveryRepository repository;

    public DeliveryServiceImpl(DeliveryFactory deliveryFactory, DeliveryRepository repository) {
        this.deliveryFactory = deliveryFactory;
        this.repository = repository;
    }

    public List<DeliveryDTO> getAll() {

      List<Delivery> deliveries= repository.findAll();
     return deliveryFactory.createList(deliveries);

    }
}
