package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ReportService {

    public ReportService() {
        System.out.println("ReportService created");
    }

    public void CreateReport() {
        System.out.println("Creating Report");
    }
}
