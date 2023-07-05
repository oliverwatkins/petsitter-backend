package com.petsitter.entity.dto;

import com.petsitter.model.PetType;

import java.util.List;

public class PetDto {

    public long id;
    public String name;
    public PetType type;
//type

    public PetDto() {}

    public PetDto(long id, String name, PetType type) {
        this.id = id;
        this.name = name;
        this.type = type;

    }
}
