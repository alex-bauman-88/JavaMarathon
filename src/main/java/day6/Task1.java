/*
В классах Автомобиль и Мотоцикл реализуйте два метода:
void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает разницу
между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
Пример: inputYear передан как 2020, поле класса year инициализировано числом 2010 или наоборот, должно быть
возвращено одно и тоже положительное число 10. Такого понятия как “некорректный ввод” или любое другое
сигнализирующее об ошибке, здесь быть не может

В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.

 */


package day6;

public class Task1 {
    public static void main(String[] args) {

        Motorbike motorbike1 = new Motorbike(1989);
        motorbike1.info();

        int differenceMoto = motorbike1.yearDifference(1930);
        System.out.println("The difference is " + differenceMoto + " year(s)");

        Car car1 = new Car(2021);
        car1.info();

        int differenceCar = car1.yearDifference(2025);
        System.out.println("The difference is " + differenceCar + " year(s)");
    }
}


