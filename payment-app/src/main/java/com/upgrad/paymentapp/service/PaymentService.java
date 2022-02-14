package com.upgrad.paymentapp.service;

import com.upgrad.paymentapp.entity.TransactionDetailsEntity;

public interface PaymentService {

    public int createTransaction(TransactionDetailsEntity transactionDetailsEntity, int bookingId);
}
