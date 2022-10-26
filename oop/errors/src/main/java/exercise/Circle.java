package exercise;

import static java.lang.Math.*;

// BEGIN
public class Circle {

    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Error! Negative radius");
        } else {
            return PI * pow(radius, 2);
        }
    }
}
// END
