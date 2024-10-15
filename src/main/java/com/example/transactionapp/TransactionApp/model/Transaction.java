package com.example.transactionapp.TransactionApp.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "transaction")

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //create the various fields needed for the table
    private User sender;
    private User receiver;
    private Integer amount;
    private LocalDateTime transactionDate;

}
