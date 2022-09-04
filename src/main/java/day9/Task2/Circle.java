
package day9.Task2;

public class Circle extends Figure {

    private double radius;

    Circle(double circleRadius, String color) {
        super(color);
        this.radius = circleRadius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
