package com.example.transactionapp.TransactionApp.repository;

import com.example.transactionapp.TransactionApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
