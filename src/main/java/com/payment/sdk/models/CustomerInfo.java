package com.payment.sdk.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerInfo {
    public String firstName;
    public String lastName;
    public String email;
    public String customerCode;
    public String phone;
    public String userFullName;
}
