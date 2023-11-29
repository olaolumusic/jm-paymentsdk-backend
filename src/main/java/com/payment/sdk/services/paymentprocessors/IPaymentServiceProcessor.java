package com.payment.sdk.services.paymentprocessors;

import com.payment.sdk.models.Payment;
import com.payment.sdk.services.dtos.PaymentInput;

public interface IPaymentServiceProcessor {
    Payment confirm(PaymentInput input);
}
