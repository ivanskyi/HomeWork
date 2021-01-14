package com.ivanskyi.bicycleDepartment;

import com.ivanskyi.bicycleDepartment.bicycleParts.Frame;
import com.ivanskyi.bicycleDepartment.bicycleParts.Rudder;
import com.ivanskyi.bicycleDepartment.bicycleParts.Wheels;

public class Bicycle {
    BicycleBrand bicycleBrand;
    Rudder rudder;
    Wheels wheels;
    Frame frame;

    public void setRudder(Rudder rudder) {
        this.rudder = rudder;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void setBicycleBrand(BicycleBrand bicycleBrand) {
        this.bicycleBrand = bicycleBrand;
    }

    public void getAllCharacteristics(){
           System.out.println("Bicycle Characteristics " + "\nBrand : " + bicycleBrand
                   + "\nRudder material : " + rudder.getMaterial()
                   + "\nWheels  brand : " + wheels.getWheelBrands() + ". " + "\nWheels  Size: " + wheels.getSizeInInch()
                   + "\nFrame  brand: " + frame.getFrameBrands() + "\nFrame size : " + frame.getFrameSize()
           );
    }
}
