package com.example.delivery_bd.parser;

import com.example.delivery_bd.dto.DeliveryDTO;
import com.example.delivery_bd.dto.InfoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.ArrayList;
import java.util.List;

public class JsonParser {

  public List<InfoDTO> parseInfo(String jsonArrayString) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();

      JsonNode jsonArray = objectMapper.readTree(jsonArrayString);
      List<InfoDTO> infoList = new ArrayList<>();
      for (JsonNode element : jsonArray) {
        InfoDTO infoDTO = null;
        try {
          infoDTO = objectMapper.treeToValue(element, InfoDTO.class);
        } catch (JsonProcessingException e) {
          throw new RuntimeException(e);
        }
        infoList.add(infoDTO);
        DeliveryDTO deliveryDTO=new DeliveryDTO();
        deliveryDTO.setInfo(infoList);
      }


    return infoList;
  }
}
