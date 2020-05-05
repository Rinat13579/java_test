package ru.jt.sandbox;

import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testPoint () {
        Point p1 = new Point (0,0);
        Point p2 = new Point (0, 0);
        assert p1.distance(p2) == 0;
    }
}
