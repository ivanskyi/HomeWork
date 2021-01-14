package com.ivanskyi.bicycleDepartment.bicycleParts;

public class Wheels {
    WheelBrands wheelBrands;
    int sizeInInch;

    public Wheels(WheelBrands wheelBrands, int wheelSize) {
        this.wheelBrands = wheelBrands;
        this.sizeInInch = wheelSize;
    }

    public WheelBrands getWheelBrands() {
        return wheelBrands;
    }

    public int getSizeInInch() {
        return sizeInInch;
    }
}