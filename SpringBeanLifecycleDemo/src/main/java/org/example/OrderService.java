package org.example;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private PaymentService paymentService;

    @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("OrderService Constructed");
    }

    public void PlaceOrder(){
        paymentService.pay();
        System.out.println("Order Placed.");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("BeanName : " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationCOntext Name : " + applicationContext.getClass().getSimpleName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @PostConstruct
    public void start(){
        System.out.println("start");
    }

    @PreDestroy
    public void stop(){
        System.out.println("stop");
    }
}
