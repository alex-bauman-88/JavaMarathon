/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
его случайными числами от 0 до 10 (включительно). Используя цикл for each вывести содержимое массива в консоль,
а также вывести в консоль информацию о:

а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]

Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46

*/

package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner arrayOne = new Scanner(System.in);
        int n = arrayOne.nextInt();
        int[] numbersArray = new int[n];

        for (int i = 0; i < n; i++) {
            numbersArray[i] = (int) Math.round(Math.random() * 10);
        }
        for (int x : numbersArray) {
            System.out.print(x + " | ");
        }
        System.out.println();

        // а) Длине массива

        System.out.println("Array length: " + numbersArray.length);

        // б) Количестве чисел больше 8

        int greater8 = 0;
        for (int i : numbersArray) {
            if (i > 8) {
                greater8++;
            }
        }
        System.out.println("Quantity of numbers greater than 8: " + greater8);

        // в) Количестве чисел равных 1

        int equal1 = 0;
        for (int i : numbersArray) {
            if (i == 1) {
                equal1++;
            }
        }
        System.out.println("Quantity of numbers equal to 1: " + equal1);

        // г) Количестве четных чисел

        int even = 0;
        // ======== FOR CYCLE
//        //  for (int w = 0; w < n; w++) {
//            if (numbersArray[w] % 2 == 0) {
//                even++;
//            }
//        }
        // ======== FOR-EACH CYCLE
        for (int i : numbersArray) {
            if (i % 2 == 0) {
                even++;
            }
        }
        System.out.println("Quantity of even numbers: " + even);

        // д) Количестве нечетных чисел

        int odd = 0;
        for (int i: numbersArray) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Quantity of odd numbers: " + odd);

        // е) Сумме всех элементов массива

        int sum = 0;
        for (int i : numbersArray) {
            sum += i;
        }
        System.out.println("Sum of array numbers: " + sum);
    }
}
