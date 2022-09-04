
package day9.Task2;

public abstract class Figure {
    private String color;

    public String getColor() {
        return color;
    }

    Figure(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

}
