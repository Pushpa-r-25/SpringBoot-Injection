package com.poject.springbootinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootInjectionApplication {

    public static void main(String[] args) {
             ApplicationContext context =
                     SpringApplication.run(SpringBootInjectionApplication.class, args);
             var orderService = context.getBean(OrderService.class);
             orderService.placeOrder();

      /*  SpringApplication.run(SpringBootInjectionApplication.class, args);

        // HDFC Payment
        var orderServiceHDFC = new OrderService(new HDFCBankPaymentService());
        orderServiceHDFC.placeOrder();

        System.out.println();

        // ICICI Payment
        var orderServiceICICI = new OrderService(new ICICIBankPaymentService());
        orderServiceICICI.placeOrder();

       */
//        setting setter injection
//        var OrderService = new OrderService();
//        OrderService.setPaymentService(new HDFCBankPaymentService());
//        OrderService.placeOrder();
    }
}
