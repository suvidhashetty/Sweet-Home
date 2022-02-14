package com.upgrad.paymentapp.repository;

import com.upgrad.paymentapp.dto.PaymentDto;
import com.upgrad.paymentapp.entity.TransactionDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<TransactionDetailsEntity, Integer> {
}
