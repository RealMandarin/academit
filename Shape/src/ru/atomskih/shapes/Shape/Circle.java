package ru.atomskih.shapes.Shape;

public class Circle implements Shape, Comparable<Shape> {

    String name = "Круг";
    private double radius;


    public Circle(double radius) {
        this.radius = radius;

    }


    public double getWidth() {
        return radius * 2;
    }

    public double getHeight() {
        return radius * 2;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Circle c = (Circle) o;
        return radius == c.radius;

    }

    @Override
    public int hashCode() {

        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int) radius;
        return hash;
    }



    @Override
    public int compareTo(Shape o) {
        if(this.getArea()> o.getArea()){
            return -1;
        }else {
            return 1;
        }
    }
}