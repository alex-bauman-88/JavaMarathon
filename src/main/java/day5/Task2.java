/*

2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
Вывести в консоль значение каждого из полей, используя get методы.
 */


package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Suzuki", "red", 1958);
        Motorbike motorbike2 = new Motorbike();
        System.out.println("Motorbike model: " + motorbike1.getModel() + "; motorbike color: " + motorbike1.getColor() + "; motorbike year: " + motorbike1.getYear());
        System.out.println("Motorbike model: " + motorbike2.getModel() + "; motorbike color: " + motorbike2.getColor() + "; motorbike year: " + motorbike2.getYear());
    }
}

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(){
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