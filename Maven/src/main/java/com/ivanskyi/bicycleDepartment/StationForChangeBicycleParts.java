package com.ivanskyi.bicycleDepartment;

import com.ivanskyi.bicycleDepartment.bicycleParts.Frame;
import com.ivanskyi.bicycleDepartment.bicycleParts.Rudder;
import com.ivanskyi.bicycleDepartment.bicycleParts.Wheels;

public class StationForChangeBicycleParts {
    Bicycle bicycle;

    public void addBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void replaceRudder(Rudder rudder) {
        bicycle.setRudder(rudder);
    }

    public void replaceWheels(Wheels wheels) {
        bicycle.setWheels(wheels);
    }

    public void replaceFrame(Frame frame) {
        bicycle.setFrame(frame);
    }
}
