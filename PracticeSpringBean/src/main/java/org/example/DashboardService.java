package org.example;

import org.springframework.stereotype.Component;

@Component
public class DashboardService {
    public DashboardService(ReportService reportService) {
        System.out.println("DashboardService created");
    }
}
