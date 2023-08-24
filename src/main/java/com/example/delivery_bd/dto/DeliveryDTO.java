package com.example.delivery_bd.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class DeliveryDTO {

    Long id;
    String name;
    List<InfoDTO> infoDTOS;

}
