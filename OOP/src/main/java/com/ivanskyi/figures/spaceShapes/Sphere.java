package com.ivanskyi.figures.spaceShapes;

import com.ivanskyi.figures.planes.VertexIn2D;

public class Sphere extends SpaceShape {
    double radius;

    public Sphere(VertexIn2D firstVertix, double radius) {
        super(firstVertix);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}