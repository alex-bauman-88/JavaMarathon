/*
2. Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
Используя цикл while, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие
(делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше условие
(делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
Если a >= b вывести сообщение "Некорректный ввод".

Пример:
Вводим в консоли: 7 78
Вывод: 15 25 35 45 55 65 75

*Для получения из консоли двух чисел, разделенных пробелом, можно использовать метод nextInt() вызвав его дважды.

Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();

*/

package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        //System.out.println("Enter two numbers");
        int a = number1.nextInt();
        int b = number1.nextInt();

        if (a >= b) {
            System.out.println("Incorrect");
        } else {
            while (a < b) {
                a++;
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
