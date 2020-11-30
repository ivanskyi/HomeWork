package com.ivanskyi.figures.planeShapes;

import com.ivanskyi.figures.Shape;
import com.ivanskyi.figures.planes.VertexIn2D;
import com.ivanskyi.interfaces.PerimeterMeasurable;

public class PlaneShape extends Shape implements PerimeterMeasurable {
VertexIn2D firstVertex;

    PlaneShape(VertexIn2D firstVertex){
        this.firstVertex = firstVertex;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public String toString() {
        String name = "Figure have name : " + this.getClass().getSimpleName();
        String perimeter = "This is perimeter for this figure : "  + this.getPerimeter();
        String area = "This is area for this figure : " + this.getArea();
        String threeStar = " * * * ";
        return name + "\n" + perimeter + "\n" + area + "\n" + threeStar;
    }
}