package com.upgrad.bookingapp.repositories;

import com.upgrad.bookingapp.entitites.BookingInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingInfoEntity, Integer> {
}
