package com.ivanskyi.figures.planeShapes;

import com.ivanskyi.figures.planes.VertexIn2D;

public class Rectangle extends PlaneShape {
    double width;
    double height;

    public Rectangle(VertexIn2D firstVertex, double width, double height) {
        super(firstVertex);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}