package com.example.delivery_bd.mapstract;


import com.example.delivery_bd.dto.InfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface InfoMapper {
    @Mapping(target="number", source="number")
    @Mapping(target="phone", source="phone")
    @Mapping(target="email", source="email")

    InfoDTO  toInfoDTO(String info);
}
