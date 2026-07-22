package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "payment")
public class PaymentProperties {

    private  String provider;
    private  int retryCount;
    private  boolean enabled;
    private  int timeout;

   public PaymentProperties(){}

    public String getProvider() {
        return provider;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public int getTimeout() {
        return timeout;
    }


    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
