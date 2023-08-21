package com.example.delivery_bd.controller;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.model.Delivery;
import com.example.delivery_bd.service.DeliveryService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeliveryController {
    private final DeliveryService service;
    private final ModelMapper modelMapper;
    public DeliveryController(DeliveryService service, ModelMapper modelMapper) {

        this.service = service;
        this.modelMapper=modelMapper;
    }
    @GetMapping("/all")
    public List<Delivery> findAll() {
List<DeliveryDTO> deliveryDTO =service.getAll();
return dtoToDelivery(deliveryDTO);
    }
    private List<Delivery> dtoToDelivery(List<DeliveryDTO> deliveryDTO) {
        return (List<Delivery>) modelMapper.map(deliveryDTO, Delivery.class);
    }
    }

