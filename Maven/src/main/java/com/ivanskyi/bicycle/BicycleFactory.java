package com.ivanskyi.bicycle;

import com.ivanskyi.bicycle.brands.CANNONDALE;
import com.ivanskyi.bicycle.brands.GT;
import com.ivanskyi.bicycle.brands.TREK;

public class BicycleFactory {
    public Bicycle createBicycle(BicycleBrand type) {
        Bicycle bicycle = null;
        switch (type) {
            case GT:
                bicycle = new GT();
                break;
            case CANNONDALE:
                bicycle = new CANNONDALE();
                break;
            case TREK:
                bicycle = new TREK();
                break;
        }
        return bicycle;
    }
}
