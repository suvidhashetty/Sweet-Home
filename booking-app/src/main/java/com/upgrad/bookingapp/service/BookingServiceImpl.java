package com.upgrad.bookingapp.service;

import com.upgrad.bookingapp.entitites.BookingInfoEntity;
import com.upgrad.bookingapp.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Random;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public BookingInfoEntity createBooking(BookingInfoEntity bookingInfoEntity) {

        setRoomPrice(bookingInfoEntity);

        //Generate random list of room number, convert to string and store in Database
        ArrayList<String> roomNumbers = getRandomNumbers(bookingInfoEntity.getNumOfRooms());
        String listString = String.join(", ", roomNumbers);
        bookingInfoEntity.setRoomNumbers(listString);

        BookingInfoEntity savedBooking = bookingRepository.save(bookingInfoEntity);
        return savedBooking;
    }


    public void setRoomPrice(BookingInfoEntity bookingInfoEntity){
        int numOfRooms = bookingInfoEntity.getNumOfRooms();
        long numOfDays = DAYS.between(bookingInfoEntity.getFromDate(), bookingInfoEntity.getToDate());
        int roomPrice = 1000 * numOfRooms;
        roomPrice = roomPrice * (int)numOfDays;
        System.out.println(numOfDays);
        bookingInfoEntity.setRoomPrice(roomPrice);

        bookingInfoEntity.setBookedOn(java.time.LocalDateTime.now());
    }

    public static ArrayList<String> getRandomNumbers(int count){
        Random rand = new Random();
        int upperBound = 100;
        ArrayList<String>numberList = new ArrayList<String>();

        for (int i=0; i<count; i++){
            numberList.add(String.valueOf(rand.nextInt(upperBound)));
        }
        return numberList;
    }
}
