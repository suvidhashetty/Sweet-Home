package com.upgrad.bookingapp.feign;

import com.upgrad.bookingapp.entitites.TransactionDetailsEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="PAYMENT-SERVICE")
public interface PaymentServiceClient {

    @RequestMapping(value="${paymentApp.createPaymentPath}", method = RequestMethod.POST)
    public TransactionDetailsEntity createPayment(@PathVariable("bookingId") int bookingId);
}
