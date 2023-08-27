package com.example.delivery_bd.mapstract;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.model.Delivery;
import com.example.delivery_bd.parser.JsonParser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DeliveryFactory {
    public List<DeliveryDTO> createList(List<Delivery> deliveryList) {
        return deliveryList.stream()
                .map(this::createDeliveryDTO)
                .collect(Collectors.toList());
    }

    public DeliveryDTO createDeliveryDTO(Delivery delivery) {
        return DeliveryDTO.builder()
                .id(delivery.getId())
                .name(delivery.getName())
                .infoDTOS(JsonParser.parseInfo(delivery.getInfo()))
                .build();
    }
}
