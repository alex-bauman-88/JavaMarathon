/*
Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы (необходимо использовать рекурсивные вызовы).
Использовать статическое поле для хранения суммы не рекомендуется, такое решение нельзя назвать полноценно рекурсивным.

Пример:
int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
System.out.println(recursionSum(...)); // 65346

*recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.

*/
package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0)); // 65346
    }

    public static int recursionSum(int[] numbers, int counter){
        if (counter == numbers.length)
            return 0;
        return numbers[counter] + recursionSum(numbers, ++counter);
    }

}
