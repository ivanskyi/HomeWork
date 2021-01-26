package com.ivanskyi;

import com.ivanskyi.functional.RealizatorAllServices;

public class Application {
    static private RealizatorAllServices realizatorAllServices =
            new RealizatorAllServices();

    public static void main(String[] args) {
       realizatorAllServices.startRealization();
    }
}
