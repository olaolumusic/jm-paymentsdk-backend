package com.payment.sdk.services.paymentprocessors;

import com.payment.sdk.models.Payment;
import com.payment.sdk.services.dtos.PaymentInput;
import org.springframework.stereotype.Service;

@Service
public class MonnifyPaymentProcessor implements IPaymentServiceProcessor {

    @Override
    public Payment confirm(PaymentInput input) {
        return null;
    }
}
