package com.upgrad.bookingapp.controller;

import com.upgrad.bookingapp.dto.BookingDto;
import com.upgrad.bookingapp.entitites.BookingInfoEntity;
import com.upgrad.bookingapp.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="hotel")
public class BookingController extends BookingDto {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    BookingService bookingService;

    @PostMapping(value = "/booking")
    public ResponseEntity createBooking(@RequestBody BookingDto bookingDto){

        BookingInfoEntity bookingInfoEntity = modelMapper.map(bookingDto, BookingInfoEntity.class);

        BookingInfoEntity savedBooking = bookingService.createBooking(bookingInfoEntity);

        return new ResponseEntity(savedBooking, HttpStatus.OK);

    }


}
