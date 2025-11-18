package com.poject.springbootinjection;

import org.springframework.stereotype.Service;

@Service("icici")
public class ICICIBankPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Gateway: ICICI Bank");
        System.out.println("Processing Payment amount: " + amount);
    }
}
