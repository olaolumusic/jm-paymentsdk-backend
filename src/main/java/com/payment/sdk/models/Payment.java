package com.payment.sdk.models;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Builder
public class Payment {
    public String userFullName;
    public String status;
    public String statusCode;
    public String paymentReference;
    public String transactionReference;
    public Double amount;
    public Double totalAmount;
    public String message;
    public String paymentFor;
    public String gatewayResponse;
    public String channel;
    public String source;
    public String currency;
    public String payLoad;
    public Double fees;
    public CardInfo cardInfo;
    public CustomerInfo Customer;
    public OffsetDateTime TransactionDate;
    public OffsetDateTime CreationTime;

}
