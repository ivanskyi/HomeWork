package com.ivanskyi.bicycle.parts;

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
