package com.payment.sdk.models;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Builder
public class CardInfo {
    public String authorizationCode;
    public String cardType;
    public String last4;
    public long expMonth;
    public long expYear;
    public String bank;
    public String channel;
    public boolean reusable;
    public OffsetDateTime creationTime;
}
