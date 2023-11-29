package com.payment.sdk.controllers;

import com.payment.sdk.services.IPaymentService;
import com.payment.sdk.services.PaymentService;
import com.payment.sdk.services.dtos.PaymentInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("v1/payment")
public class PaymentController {
    private final IPaymentService paymentService;

    @Autowired
    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<?> confirm(@RequestBody PaymentInput input) {
        var paymentResponse = paymentService.confirm(input);
        return ok(paymentResponse);
    }
}
