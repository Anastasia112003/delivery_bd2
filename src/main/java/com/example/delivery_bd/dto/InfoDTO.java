package com.example.delivery_bd.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class InfoDTO {
    Long number;
    String phone;
    String email;
}
