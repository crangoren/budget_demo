package com.pet.budget_demo.controllers;

import com.pet.budget_demo.enteties.Payment;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PaymentController {

    @GetMapping("/payments/")
    public List<Payment> findAll() {
        return paymentConverter.
    }
}
