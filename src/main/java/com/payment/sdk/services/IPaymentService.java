package com.payment.sdk.services;

import com.payment.sdk.models.Payment;
import com.payment.sdk.services.dtos.PaymentInput;
import com.payment.sdk.services.dtos.Response;

public interface IPaymentService {
    Response<Payment> confirm(PaymentInput input);
}
