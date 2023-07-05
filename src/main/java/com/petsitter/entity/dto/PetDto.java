package com.petsitter.entity.dto;

import java.util.List;

public class PetDto {

    public long id;
    public String name;
//type

    public PetDto() {}

    public PetDto(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
