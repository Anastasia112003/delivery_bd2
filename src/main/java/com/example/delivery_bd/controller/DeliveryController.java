package com.example.delivery_bd.controller;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.mapstract.DeliveryMapper;
import com.example.delivery_bd.service.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class DeliveryController {
    public static final String json = "id: 1+\n" +
            "name : \"макдак\",\n" +
            "        info: [\n" +
            "            {\n" +
            "                number: 1,\n" +
            "                phone: \"8(955)123-15-89\",\n" +
            "                email: \"lol@mail.ru\"\n" +
            "            },\n" +
            "            {\n" +
            "                number: 2,\n" +
            "                phone: \"8(955)123-15-89\",\n" +
            "                email: \"kek@gmail.com\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }";
    private final DeliveryService service;
    private final DeliveryMapper deliveryMapper;

    public DeliveryController(DeliveryService service, DeliveryMapper deliveryMapper) {

        this.service = service;
        this.deliveryMapper = deliveryMapper;
    }


    @GetMapping("/all")
    public List<DeliveryDTO> findAll() {

      return  service.getAll().stream().map(deliveryMapper::toDTO).collect(Collectors.toList());

    }




}

