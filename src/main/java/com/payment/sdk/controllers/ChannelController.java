package com.payment.sdk.controllers;

import com.payment.sdk.services.IPaymentChannelService;
import com.payment.sdk.services.PaymentChannelService;
import com.payment.sdk.services.dtos.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/channel")
public class ChannelController {

    final IPaymentChannelService paymentChannelService;

    @Autowired
    public ChannelController(PaymentChannelService paymentChannelService) {
        this.paymentChannelService = paymentChannelService;
    }

    @GetMapping
    public Response<?> getAll() {
        return paymentChannelService.getAll();
    }
}
