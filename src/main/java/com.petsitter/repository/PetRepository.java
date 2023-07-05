package com.petsitter.repository;

import com.petsitter.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface PetRepository extends JpaRepository<PetEntity, String> {

//    UserEntity findByUserNameIgnoreCase(String userName);

//    boolean existsByUserNameContainingIgnoreCase(String userName);
//
//    @Transactional
//    void deleteByUserName(String userName);
}
