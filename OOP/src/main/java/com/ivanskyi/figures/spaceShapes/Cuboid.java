package com.ivanskyi.figures.spaceShapes;

import com.ivanskyi.figures.planes.VertexIn2D;

public class Cuboid extends SpaceShape{
    double width;
    double height;
    double depth;

    public Cuboid(VertexIn2D firstVertix, double width, double height, double depth) {
        super(firstVertix);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 6 * height * width;
    }

    @Override
    public double getVolume() {
        return height * width * depth;
    }
}