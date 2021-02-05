package com.ivanskyi.figures.planeShapes;

import com.ivanskyi.figures.planes.VertexIn2D;

public class Circle extends PlaneShape {
    double radius;

    public Circle(VertexIn2D firstVertex, double radius) {
        super(firstVertex);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }
}