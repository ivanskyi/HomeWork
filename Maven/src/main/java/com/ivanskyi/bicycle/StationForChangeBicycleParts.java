package com.ivanskyi.bicycle;

import com.ivanskyi.bicycle.parts.Frame;
import com.ivanskyi.bicycle.parts.Rudder;
import com.ivanskyi.bicycle.parts.Wheels;

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
