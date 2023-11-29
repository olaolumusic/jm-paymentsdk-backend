package com.payment.sdk.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentChannel {
    public String name;
    public String shortCode;
    public String imageUrl;
    public boolean isActive;
}
