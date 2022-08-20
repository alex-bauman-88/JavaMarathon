/*
3. Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.

Ключевое слово else или два if использовать в этой программе нельзя.
В решении обязательно использовать оператор continue.

Пример:
4 2 - ваш ввод в консоль
2.0 - ответ программы
100 0 - ваш ввод в консоль
Деление на 0 - ответ программы
13 10 - ваш ввод в консоль
1.3 - ответ программы
и так далее… (еще 2 итерации)

*/

package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            double divisible = numbers.nextDouble();
            double divisor = numbers.nextDouble();

            if (divisor == 0) {
                System.out.println("Division by zero");
                continue;
            }
            System.out.println(divisible / divisor);
        }
    }
}
