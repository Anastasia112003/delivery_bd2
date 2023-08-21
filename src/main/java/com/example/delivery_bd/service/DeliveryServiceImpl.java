package com.example.delivery_bd.service;

import com.example.delivery_bd.dto.DeliveryDTO;
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
    public List<DeliveryDTO> getAll() {

        return repository.findAll();
    }
}
