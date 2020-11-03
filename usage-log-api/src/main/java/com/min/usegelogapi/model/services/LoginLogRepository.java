package com.min.usegelogapi.model.services;

import com.min.usegelogapi.model.tables.LoginLog;
import com.min.usegelogapi.model.tables.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LoginLogRepository extends JpaRepository<LoginLog, Integer> {
//    Optional<LoginLog>
}
