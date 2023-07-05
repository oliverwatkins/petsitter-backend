package com.petsitter.repository;

import com.petsitter.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;


public interface UserRepository extends JpaRepository<UserEntity, String> {

    public UserEntity findByUserName(String userName);

    public UserEntity findByUserNameIgnoreCase(String userName);


//    UserEntity findByUserNameIgnoreCase(String userName);

//    UserEntity findByUserNameIgnoreCase(String userName);
//
//    boolean existsByUserNameContainingIgnoreCase(String userName);

//    @Transactional
//    void deleteByUserName(String userName);
}
