package com.example.controller;

import com.example.service.ICustomerService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/customer")
public class CustomerController {
    @Inject
    private ICustomerService customerService;

    @Get("/test")
    public String test(){
        return customerService.test();
    }
}
