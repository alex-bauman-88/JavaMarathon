package day5;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike() {
        this.model = "The best motorbike";
        this.color = "black";
        this.year = 2000;
    }

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }


}
