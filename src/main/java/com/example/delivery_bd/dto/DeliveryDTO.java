package com.example.delivery_bd.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class DeliveryDTO {

        Integer id;
        String name;
        List<InfoDTO> info;

}
