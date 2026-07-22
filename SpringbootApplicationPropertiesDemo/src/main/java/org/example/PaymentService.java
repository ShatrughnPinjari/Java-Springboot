package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//    @Value("${paymentService.provider}")
    private final String provider;

//    @Value("${paymentService.retry-count}")
    private final int retryCount;

//    @Value("${paymentService.enabled}")
    private final boolean isEnabled;

//    @Value("${paymentService.timeout}")
    private final int timeout;

    public PaymentService(@Value("${paymentService.provider}")String provider,
                          @Value("${paymentService.retry-count}") int retryCount,
                          @Value("${paymentService.enabled}") boolean isEnabled,
                          @Value("${paymentService.timeout}") int timeout) {
        this.provider = provider;
        this.retryCount = retryCount;
        this.isEnabled = isEnabled;
        this.timeout = timeout;

    }
//
//    public PaymentService(){
//
//    }

//    public void setProvider(String provider) {
//        this.provider = provider;
//    }
//
//    public void setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//    }
//
//    public void setEnabled(boolean enabled) {
//        isEnabled = enabled;
//    }
//
//    public void setTimeout(int timeout) {
//        this.timeout = timeout;
//    }


//    public String getProvider() {
//        return provider;
//    }
//
//    public int getRetryCount() {
//        return retryCount;
//    }
//
//    public boolean isEnabled() {
//        return isEnabled;
//    }
//
//    public int getTimeout() {
//        return timeout;
//    }

    public void pay(){
//        System.out.println("Payment done");
//        System.out.println(getProvider());
//        System.out.println(getRetryCount());
//        System.out.println(getTimeout());
//        System.out.println(isEnabled());
        System.out.println("Payment Service Provider: " + provider + " Retry Count: " + retryCount);
        System.out.println("Payment Service Enabled: " + isEnabled);
        System.out.println("Payment Service Timeout: " + timeout);
    }
}
