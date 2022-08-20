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
        double[] numbersArray = new double[n];

        for (int i = 0; i < n; i++) {
            numbersArray[i] = Math.round(Math.random() * 10);
        }
        for (double x : numbersArray) {
            System.out.print(x + " | ");
        }
        System.out.println();
        System.out.println("Array length: " + numbersArray.length);

        int y = 0;
        for (double m : numbersArray) {
            if (m - 8 > 0) {
                y++;
            }
        }
        System.out.println("Quantity of numbers more than 8: " + y);

        int q = 0;
        for (double m : numbersArray) {
            if (m == 1) {
                q++;
            }
        }
        System.out.println("Quantity of numbers equal to 1: " + q);

        int e = 0;
        for (int w = 0; w < n; w++) {
            if (numbersArray[w] % 2 == 0) {
                e++;
            }
        }
        System.out.println("Quantity of even numbers: " + e);

        int r = 0;
        for (int t = 0; t < n; t++) {
            if (numbersArray[t] % 2 != 0) {
                r++;
            }
        }
        System.out.println("Quantity of odd numbers: " + r);

        double sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum = numbersArray[i] + sum;
        }
        System.out.println("Sum of array numbers: " + sum);
    }
}
