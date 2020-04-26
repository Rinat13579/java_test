package ru.jt.sandbox;

public class Point {

    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2){
        double d = Math.sqrt((p2.x - this.x) + (p2.y - this.y));
        return d;

    }

}
