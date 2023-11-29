package com.payment.sdk.models.enums;

public enum PaymentSource {
    INTERSWITCH("Interswitch", "ISW"),
    PAYSTACK("Paystack", "PYSTK"),
    MONNIFY("Monnify", "MNFY");

    PaymentSource(String name, String code) {
        this.name = name;
        this.code = code;
    }

    final String name;
    final String code;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
