package com.payment.sdk.services;

import com.payment.sdk.services.dtos.Response;

public interface IPaymentChannelService {
     Response<?> getAll();
}
