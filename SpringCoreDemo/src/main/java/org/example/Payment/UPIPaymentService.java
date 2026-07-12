package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class UPIPaymentService implements PaymentService {

    @Override
    public void payment(){
        System.out.println("Payment is successfully completed via UPI");
    }
}
