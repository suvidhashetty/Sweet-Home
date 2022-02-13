package com.upgrad.bookingapp.feign;

import com.upgrad.bookingapp.entitites.BookingInfoEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.Path;

@FeignClient(name="PAYMENT-SERVICE")
public interface BookingServiceClient {

    @RequestMapping(value="$booking/{BookingApp.bookingPath}/transcation", method = RequestMethod.POST)
    public BookingInfoEntity createBooking();
}
