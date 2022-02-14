package com.upgrad.paymentapp.service;

import com.upgrad.paymentapp.entity.TransactionDetailsEntity;
import com.upgrad.paymentapp.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public int createTransaction(TransactionDetailsEntity transactionDetailsEntity, int bookingId) {
        transactionDetailsEntity.setBookingId(bookingId);
        TransactionDetailsEntity savedTransaction = paymentRepository.save(transactionDetailsEntity);
        return savedTransaction.getTransactionId();
    }
}
