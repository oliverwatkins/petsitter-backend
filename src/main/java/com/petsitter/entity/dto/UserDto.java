package com.petsitter.entity.dto;

import java.math.BigDecimal;
import java.util.List;

public class UserDto {

    public long id;
    public String name;
    public List<PetDto> pets;

    public UserDto() {}

    public UserDto(long id, String name, List<PetDto> pets) {
        this.id = id;
        this.pets = pets;
        this.name = name;
    }
}
