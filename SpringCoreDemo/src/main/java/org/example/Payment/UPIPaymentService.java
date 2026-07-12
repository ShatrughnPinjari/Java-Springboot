package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier
@Primary
public class UPIPaymentService implements PaymentService {

    @Override
    public void payment(){
        System.out.println("Payment is successfully completed via UPI");
    }
}
