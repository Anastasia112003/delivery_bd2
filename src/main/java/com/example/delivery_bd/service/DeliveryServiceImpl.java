package com.example.delivery_bd.service;

import com.example.delivery_bd.model.Delivery;
import com.example.delivery_bd.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    private final DeliveryRepository repository;

    public DeliveryServiceImpl(DeliveryRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Delivery> getAll() {

        return repository.findAll();
    }
}
