package com.poject.springbootinjection;
import com.poject.springbootinjection.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;

    public OrderService() {}

    @Autowired
    public OrderService(@Qualifier("icici") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        System.out.println("Order Placed");
        paymentService.processPayment(2500);
    }
}