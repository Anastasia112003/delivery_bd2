package com.example.delivery_bd.mapper;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.model.Delivery;
import com.example.delivery_bd.parser.JsonParser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeliveryMapper {
    private final ModelMapper modelMapper;

    public DeliveryMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    public List<Delivery> deliveryFromDTO(String json) {
        JsonParser parser = new JsonParser();
        DeliveryDTO deliveryDTO = parser.parseInfo(json);

        Delivery delivery = this.modelMapper.map(deliveryDTO, Delivery.class);
        List<Delivery> deliveryList = new ArrayList<>();
        deliveryList.add(delivery);
        return deliveryList;
    }

}
