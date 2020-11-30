package com.ivanskyi.figures.spaceShapes;

import com.ivanskyi.figures.planes.VertexIn2D;

public class SquarePyramid extends SpaceShape {
    double height;
    double width;

    public SquarePyramid(VertexIn2D firstVertix, double height, double width) {
        super(firstVertix);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}