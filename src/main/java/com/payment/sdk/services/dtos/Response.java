package com.payment.sdk.services.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response<T> {
    boolean status;
    String message;
    T data;
}
