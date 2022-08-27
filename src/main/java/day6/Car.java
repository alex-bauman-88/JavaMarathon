package day6;

public class Car {
    private int year;

    public void info() {
        System.out.println("This is a car");
    }

    public Car (int year) {
        this.year = year;
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
