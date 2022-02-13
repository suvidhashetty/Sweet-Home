package com.upgrad.bookingapp.service;


import com.upgrad.bookingapp.entitites.BookingInfoEntity;

public interface BookingService {

    public BookingInfoEntity createBooking(BookingInfoEntity bookingInfoEntity);

    public void setRoomPrice(BookingInfoEntity bookingInfo);
}
