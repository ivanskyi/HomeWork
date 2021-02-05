package com.ivanskyi.figures.spaceShapes;

import com.ivanskyi.figures.Shape;
import com.ivanskyi.figures.planes.VertexIn2D;
import com.ivanskyi.interfaces.VolumeMeasurable;

public class SpaceShape extends Shape implements VolumeMeasurable {
    VertexIn2D firstVertix;

    public SpaceShape(VertexIn2D firstVertix) {
        this.firstVertix = firstVertix;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        String name = "Figure have name : " + this.getClass().getSimpleName();
        String volume = "This is volume for this figure : " + this.getVolume();
        String area = "This is area for this figure : " + this.getArea();
        String threeStar = " * * * ";
        return name + "\n" + volume + "\n" + area + "\n" + threeStar;
    }
}