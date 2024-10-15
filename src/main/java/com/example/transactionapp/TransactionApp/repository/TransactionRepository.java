package com.example.transactionapp.TransactionApp.repository;

import com.example.transactionapp.TransactionApp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
