package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier
public class CardPaymentService implements PaymentService{

    @Override
    public void payment(){
        System.out.println("Payment is successfully completed via Card");
    }
}
