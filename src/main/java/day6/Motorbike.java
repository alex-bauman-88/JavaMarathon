package day6;

public class Motorbike {
    private int year;

    public Motorbike(int year) {
        this.year = year;
    }

    public void info() {
        System.out.println("This is a motorbike");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

}