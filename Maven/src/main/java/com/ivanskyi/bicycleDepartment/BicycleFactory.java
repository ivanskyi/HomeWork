package com.ivanskyi.bicycleDepartment;

import com.ivanskyi.bicycleDepartment.bicycleBrands.CANNONDALE;
import com.ivanskyi.bicycleDepartment.bicycleBrands.GT;
import com.ivanskyi.bicycleDepartment.bicycleBrands.TREK;

public class BicycleFactory {
    public Bicycle createBicycle(BicycleBrand type) {
        Bicycle bicycle = null;
        switch (type){
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