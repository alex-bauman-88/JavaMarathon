/*
1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов принимает два
объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.

 */

package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 2021, 30, 400);
        Airplane airplane2 = new Airplane("Embraer", 2022, 40, 450);
        Airplane.compareAirplanes(airplane1, airplane2); // The Embraer plane is longer than the Boeing plane

        Airplane airplane3 = new Airplane("Airbus", 2022, 40, 450);
        Airplane.compareAirplanes(airplane3, airplane2); // The Embraer plane and the Airbus plane are equally long
    }
}