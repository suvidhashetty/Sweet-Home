package com.upgrad.paymentapp.controller;

import com.upgrad.paymentapp.dto.PaymentDto;
import com.upgrad.paymentapp.entity.TransactionDetailsEntity;
import com.upgrad.paymentapp.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;

@RestController
@RequestMapping(value="payment")
public class PaymentController extends PaymentDto{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    PaymentService paymentService;

    @PostMapping(value="/transaction/{bookingId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createPayment(@RequestBody PaymentDto paymentDto,
                                        @PathVariable(name = "bookingId") int bookingId){

        TransactionDetailsEntity transactionDetailsEntity = modelMapper.map(paymentDto, TransactionDetailsEntity.class);

        int savedTransaction = paymentService.createTransaction(transactionDetailsEntity, bookingId);

        return new ResponseEntity(savedTransaction, HttpStatus.OK);

    }
}
