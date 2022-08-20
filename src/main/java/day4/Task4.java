/*
4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы
и индекс первого элемента тройки.

Пример:
*Для простоты пример показан на массиве размера 10

[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [8742, 1040, 3254]

Вывод в консоль:
13036
7

*Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс первого элемента тройки,
то есть индекс числа 8742.

*/
package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] array100 = new int[100];

        for (int i = 0; i < array100.length; i++)
            array100[i] = randomNumbers.nextInt(10000);


        int sum3Max = 0;
        int index = 0;
        for (int i = 0; i < array100.length - 2; i++) {
            int sum3 = array100[i] + array100[i + 1] + array100[i + 2];

            if (sum3Max < sum3) {
                sum3Max = sum3;
                index = i;
            }
        }
        System.out.println("Sum 3 max: " + sum3Max);
        System.out.println("Index: " + index);
    }
}
