package com.example.delivery_bd.controller;

import com.example.delivery_bd.mapper.DeliveryMapper;
import com.example.delivery_bd.model.Delivery;
import com.example.delivery_bd.service.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeliveryController {
    public static final String json = "id: 1\n" +
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
    public List<Delivery> findAll() {
        deliveryMapper.deliveryFromDTO(json);
        return  service.getAll();


    }


}

