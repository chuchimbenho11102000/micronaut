package com.example.service.impl;

import com.example.service.ICustomerService;
import jakarta.inject.Singleton;

@Singleton
public class CustomerService implements ICustomerService {
    @Override
    public String test() {
        return "Test1";
    }
}
