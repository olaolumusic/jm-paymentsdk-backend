package com.payment.sdk.services.paymentprocessors;

import com.payment.sdk.models.enums.PaymentSource;

import java.nio.file.ProviderNotFoundException;

public class PaymentServiceProcessor {


    public static IPaymentServiceProcessor find(PaymentSource source) {
        switch (source) {
            case INTERSWITCH -> {
                return new InterswitchPaymentProcessor();
            }
            case PAYSTACK -> {
                return new PaystackPaymentProcessor();
            }
            case MONNIFY -> {
                return new MonnifyPaymentProcessor();
            }
            default -> throw new ProviderNotFoundException("Invalid Payment Source: " + source);
        }
    }
}
