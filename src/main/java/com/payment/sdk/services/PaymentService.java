package com.payment.sdk.services;

import com.payment.sdk.models.Payment;
import com.payment.sdk.services.dtos.PaymentInput;
import com.payment.sdk.services.dtos.Response;
import com.payment.sdk.services.paymentprocessors.PaymentServiceProcessor;
import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Override
    public Response<Payment> confirm(PaymentInput input) {
        var paymentServiceProcessor = PaymentServiceProcessor.find(input.source);
        var payment = paymentServiceProcessor.confirm(input);

        return Response.<Payment>builder()
                .message(payment.message)
                .data(payment)
                .status(true)
                .build();
    }
}
