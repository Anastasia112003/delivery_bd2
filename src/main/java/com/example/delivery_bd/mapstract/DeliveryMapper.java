package com.example.delivery_bd.mapstract;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.model.Delivery;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;




@Component
@Mapper(componentModel = "spring",uses = {InfoMapper.class})
public interface DeliveryMapper {
    @Mapping(target="id", source="id")
    @Mapping(target="name", source="name")
    @Mapping(target="infoDTOS", source="info")
    DeliveryDTO toDTO(Delivery delivery);

}
