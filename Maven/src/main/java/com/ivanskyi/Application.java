package com.ivanskyi;

import com.ivanskyi.serviceManager.ServiceRealizator;

public class Application {
static ServiceRealizator serviceRealizator = new ServiceRealizator();
    public static void main(String[] args) {
        serviceRealizator.initialAllService();
    }
}
