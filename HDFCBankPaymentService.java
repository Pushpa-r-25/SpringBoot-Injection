package com.poject.springbootinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("hdfc")
public class HDFCBankPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Gateway: HDFC Bank");
        System.out.println("Processing Payment amount: " + amount);
    }
}
