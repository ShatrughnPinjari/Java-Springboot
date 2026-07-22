package org.example;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private final PaymentProperties paymentProperties;

    public PaymentService(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public void pay(){
        System.out.println("Payment service provider : " + paymentProperties.getProvider());
        System.out.println("Payment retry count : " + paymentProperties.getRetryCount());
        System.out.println("Payment is enabled: " + paymentProperties.isEnabled());
        System.out.println("payment timeout : " + paymentProperties.getTimeout());


    }
}
