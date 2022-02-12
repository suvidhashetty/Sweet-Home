package com.upgrad.bookingapp.dao;


import com.upgrad.bookingapp.entitites.BookingInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<BookingInfoEntity, Integer> {
}
