package day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Manufacturer: " + manufacturer + "; year: " + year + "; length: " + length +
                "; weight: " + weight + "; fuel: " + fuel);
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + "; year: " + year + "; length: " + length +
                "; weight: " + weight + "; fuel: " + fuel;
    }
}
