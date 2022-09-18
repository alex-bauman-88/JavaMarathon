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

