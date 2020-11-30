package com.ivanskyi.figures.planeShapes;

import com.ivanskyi.figures.planes.VertexIn2D;

public class Triangle extends PlaneShape{
    VertexIn2D secondVertex;
    VertexIn2D thirdVertex;
    public Triangle(VertexIn2D firstVertex, VertexIn2D secondVertex, VertexIn2D thirdVertex) {
        super(firstVertex);
        this.secondVertex = secondVertex;
        this.thirdVertex = thirdVertex;
    }

    @Override
    public double getPerimeter() {
        return firstVertex.getDistance(secondVertex)+secondVertex.getDistance(thirdVertex)
                +thirdVertex.getDistance(firstVertex);
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double distanceBetweenFirstAndSecond = firstVertex.getDistance(secondVertex);
        double distanceBetweenSecondAndThird = secondVertex.getDistance(thirdVertex);
        double distanceBetweenThirdAndFirst = thirdVertex.getDistance(firstVertex);
        return Math.sqrt((halfPerimeter*(halfPerimeter-distanceBetweenFirstAndSecond)*(halfPerimeter
                -distanceBetweenSecondAndThird)*(halfPerimeter-distanceBetweenThirdAndFirst)));
    }
}