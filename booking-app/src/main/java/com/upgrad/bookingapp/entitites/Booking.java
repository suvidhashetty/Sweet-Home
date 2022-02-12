package com.upgrad.bookingapp.entitites;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingID;

    private LocalDateTime fromDate;

    private LocalDateTime toDate;

    private String aadharNumber;

    private int numOfRooms;

    private String roomNumbers;

    @Column(nullable = false)
    private int roomPrice;

    private int transactionId = 0;

    private LocalDateTime bookedOn;
}
