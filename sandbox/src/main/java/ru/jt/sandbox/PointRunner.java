package ru.jt.sandbox;

public class PointRunner {

    public static void main(String[] args) {

        Point p1 = new Point(0,0);
        Point p2 = new Point(10,10);

        System.out.println("Distance between two points is " + p1.distance(p2));

    }

}
