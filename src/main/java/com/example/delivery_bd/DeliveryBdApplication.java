package com.example.delivery_bd;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeliveryBdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryBdApplication.class, args);
    }
    @Bean

    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
