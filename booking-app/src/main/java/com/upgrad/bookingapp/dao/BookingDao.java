package com.upgrad.bookingapp.dao;


import com.upgrad.bookingapp.entitites.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<Booking, Integer> {
}
