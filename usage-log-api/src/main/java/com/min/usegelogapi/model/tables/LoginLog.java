package com.min.usegelogapi.model.tables;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.Instant;

@ToString
@Data
@Entity(name = "login_log")
public class LoginLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "login_date")
    private Instant loginDate = Instant.now();
}
