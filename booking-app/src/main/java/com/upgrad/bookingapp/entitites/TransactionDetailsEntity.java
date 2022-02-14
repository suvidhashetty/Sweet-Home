package com.upgrad.bookingapp.entitites;

import javax.persistence.*;

@Entity
@Table(name="transaction")
public class TransactionDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentMode;

    @Column(nullable=false)
    private int bookingId;

    private String upiId;

    private String cardNumber;

    public TransactionDetailsEntity() {
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

