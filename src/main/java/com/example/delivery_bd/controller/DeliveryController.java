package com.example.delivery_bd.controller;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.service.DeliveryServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeliveryController {

    private final DeliveryServiceImpl deliveryService;

    public DeliveryController(DeliveryServiceImpl deliveryService) {
        this.deliveryService = deliveryService;

    }


    @GetMapping("/all")
    public List<DeliveryDTO> findAll() {

    return deliveryService.getAll();
    }




}

