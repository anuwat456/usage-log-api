package com.min.usegelogapi.model.services;

import com.min.usegelogapi.model.tables.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDataRepository extends JpaRepository<UserData, Integer> {
    Optional<UserData> findByUserNameAndPassWord(String userName, String passWord);
    Optional<UserData> findByUserName(String userName);
}
