package com.ivanskyi;

import com.ivanskyi.entertainmentEstablishment.RealizatorAllServices;

public class Application {
    static private RealizatorAllServices realizatorAllServices =
            new RealizatorAllServices();

    public static void main(String[] args) {
       realizatorAllServices.startRealization();
    }
}
