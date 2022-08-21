/*

1. Создать класс Автомобиль (англ. Car) с полями “Модель” (model), “Цвет” (color), “Год выпуска” (year).
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей,
используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.

 */


package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Chevrolet");
        car1.setColor("Black");
        car1.setYear(1968);
        System.out.println("Car model: " + car1.getModel() + "; car color: " + car1.getColor() + "; car year: " + car1.getYear());
    }
}

class Car {
    private String model;
    private String color;
    private int year;

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
