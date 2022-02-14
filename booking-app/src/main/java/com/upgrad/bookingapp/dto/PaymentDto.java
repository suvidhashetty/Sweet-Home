package com.upgrad.bookingapp.dto;

import com.upgrad.bookingapp.entitites.PaymentType;

public class PaymentDto {

    private int transactionId;
    private PaymentType paymentMode;
    private int bookingId;
    private String upiId;
    private String cardNumber;


    public PaymentDto() {
    }

    public PaymentDto(int transactionId, PaymentType paymentMode, int bookingId, String upiId, String cardNumber) {
        this.transactionId = transactionId;
        this.paymentMode = paymentMode;
        this.bookingId = bookingId;
        this.upiId = upiId;
        this.cardNumber = cardNumber;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentType getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentType paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
