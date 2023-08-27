package com.example.delivery_bd.parser;

import com.example.delivery_bd.dto.InfoDTO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.util.ArrayList;
import java.util.List;


public class JsonParser {

    public static List<InfoDTO> parseInfo(String jsonArrayString) {
        JSONParser parser = new JSONParser();
        JSONObject root = null;
        try {
            root = (JSONObject) parser.parse(jsonArrayString);

            JSONArray info = (JSONArray) root.get("info");

            List<InfoDTO> infoDTOList = new ArrayList<>();
            for (Object object : info) {
                JSONObject infoObject = (JSONObject) object;
                Long number = (Long) infoObject.get("number");
                String phone = (String) infoObject.get("phone");
                String email = (String) infoObject.get("email");
                InfoDTO infoDTO = new InfoDTO(number, phone, email);
                infoDTOList.add(infoDTO);
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;

    }
}
