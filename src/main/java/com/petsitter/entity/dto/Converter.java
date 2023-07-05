package com.petsitter.entity.dto;


import com.petsitter.entity.PetEntity;
import com.petsitter.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static List<UserDto> convertUserToDto(List<UserEntity> users) {
        List<UserDto> userDtos = new ArrayList<>();
        for (UserEntity user : users) {
            userDtos.add(convertUserToDto(user));
        }
        return userDtos;
    }

    public static UserDto convertUserToDto(UserEntity entity) {

        List<PetEntity> pets =  entity.getPets();
//        List<CategoryEntity> cats = productCategories.stream().map(x->x.getCategory()).collect(Collectors.toList());

        List<PetDto> petDtos = convertPetListToDtoList(pets);

        return new UserDto(entity.getId(), entity.getUserName(), petDtos);
    }

    public static List<PetDto> convertPetListToDtoList(List<PetEntity> pets) {
        List<PetDto> petDtos = new ArrayList<>();
        
        for (PetEntity petEntity : pets) {
            try {
                petDtos.add(new PetDto(petEntity.getId(), petEntity.getName(), petEntity.getType()));
            }catch(Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
        return petDtos;
    }

}
