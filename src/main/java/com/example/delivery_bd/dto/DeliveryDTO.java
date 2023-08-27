package com.example.delivery_bd.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryDTO {

    Long id;
    String name;
    List<InfoDTO> infoDTOS;

}
