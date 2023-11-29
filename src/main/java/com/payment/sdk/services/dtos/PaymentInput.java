package com.payment.sdk.services.dtos;

import com.payment.sdk.models.enums.PaymentSource;
import lombok.Data;
import lombok.NonNull;

@Data
public class PaymentInput {
    @NonNull
    public String paymentReference;
    @NonNull
    public PaymentSource source;
    public Double amount;
}
