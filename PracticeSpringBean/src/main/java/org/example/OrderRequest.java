package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OrderRequest {

    private static int counter = 0;
    private final int id = ++counter;

    public OrderRequest() {
        System.out.println("OrderRequest created." + id);
    }

    public int getId(){
        return id;
    }

}
