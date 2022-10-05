/*2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Для заполнения списка реализуйте метод, который принимает числа от, до, и ссылку на список. Вывести список.
*/

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        addNumbers(0, 30, 300, 350, numbers);
        System.out.println(numbers);
        // результат:
        // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30,
        // 300, 302, 304, 306, 308, 310, 312, 314, 316, 318, 320, 322, 324, 326, 328, 330, 332, 334, 336, 338, 340, 342, 344, 346, 348, 350]
    }
    public static void addNumbers(int initialN, int breakN, int breakN2, int lastN, List list) {
        for (int i = initialN; i <= lastN; i++) {
            if (i <= breakN && i % 2 == 0 || i >= breakN2 && i % 2 == 0)
                list.add(i);
        }
    }
}
