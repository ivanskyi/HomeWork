package com.ivanskyi;

import com.ivanskyi.figures.planeShapes.Circle;
import com.ivanskyi.figures.planeShapes.Rectangle;
import com.ivanskyi.figures.planeShapes.Triangle;
import com.ivanskyi.figures.planes.VertexIn2D;
import com.ivanskyi.figures.spaceShapes.Cuboid;
import com.ivanskyi.figures.spaceShapes.Sphere;
import com.ivanskyi.figures.spaceShapes.SquarePyramid;

public class Application {
    public static void main(String[] args) {
        VertexIn2D vertex1 = new VertexIn2D(3, 4);
        VertexIn2D vertex2 = new VertexIn2D(5, 7);
        VertexIn2D vertex3 = new VertexIn2D(8, 9);

        Triangle triangle = new Triangle(vertex1, vertex2, vertex3);
        Rectangle rectangle = new Rectangle(vertex1, 5, 6);
        Circle circle = new Circle(vertex1, 5);
        SquarePyramid squarePyramid = new SquarePyramid(vertex1, 5, 6);
        Cuboid cuboid = new Cuboid(vertex1, 5, 5, 5.66);
        Sphere sphere = new Sphere(vertex1, 5);

        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
        System.out.println(squarePyramid.toString());
        System.out.println(sphere.toString());
        System.out.println(cuboid.toString());
    }
}