package com.ivanskyi.bicycle;

import com.ivanskyi.bicycle.parts.Frame;
import com.ivanskyi.bicycle.parts.Rudder;
import com.ivanskyi.bicycle.parts.Wheels;

public class StationForChangeBicycleParts {

    public void replaceRudder(Bicycle bicycle, Rudder rudder) {
        bicycle.setRudder(rudder);
    }

    public void replaceWheels(Bicycle bicycle, Wheels wheels) {
        bicycle.setWheels(wheels);
    }

    public void replaceFrame(Bicycle bicycle, Frame frame) {
        bicycle.setFrame(frame);
    }
}
