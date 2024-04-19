package com.example.BookingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookingService.Models.User;

public interface UserRepository extends JpaRepository<User , Long> {

}
