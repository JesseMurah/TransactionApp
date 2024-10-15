package com.example.transactionapp.TransactionApp.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //create the fields for the user
    private String msisdn;
    private String username;
    private String email;
    private LocalDateTime created;


}
