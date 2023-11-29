package com.payment.sdk.services;

import com.payment.sdk.models.PaymentChannel;
import com.payment.sdk.models.enums.PaymentSource;
import com.payment.sdk.services.dtos.Response;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PaymentChannelService implements IPaymentChannelService {

    @Override
    public Response<?> getAll() {

        var channels = Arrays.asList(
                PaymentChannel.builder()
                        .imageUrl("https://website-v3-assets.s3.amazonaws.com/assets/img/hero/Paystack-mark-white-twitter.png")
                        .isActive(true)
                        .name(PaymentSource.PAYSTACK.name())
                        .shortCode(PaymentSource.PAYSTACK.getCode())
                        .build(),

                PaymentChannel.builder()
                        .imageUrl("https://raw.githubusercontent.com/PaystackHQ/nigerialogos/master/logos/interswitch/interswitch.png")
                        .isActive(true)
                        .name(PaymentSource.INTERSWITCH.name())
                        .shortCode(PaymentSource.INTERSWITCH.getCode())
                        .build(),

                PaymentChannel.builder()
                        .imageUrl("https://app.monnify.com/images/logo.svg")
                        .isActive(true)
                        .name(PaymentSource.MONNIFY.name())
                        .shortCode(PaymentSource.MONNIFY.getCode())
                        .build()
        );

        return Response.<List<PaymentChannel>>builder()
                .status(true)
                .data(channels)
                .message("Successful")
                .build();

    }
}
