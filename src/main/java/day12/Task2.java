/*2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Для заполнения списка реализуйте метод, который принимает числа от, до, и ссылку на список. Вывести список.
*/

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        addNumbers(0, 30,numbers);
        addNumbers(300, 350,numbers);

        System.out.println(numbers);

    }
    public static void addNumbers(int initialN, int lastN, List list) {
        for (int i = initialN; i <= lastN; i++) {
            if (i % 2 == 0)
                list.add(i);
        }
    }
//    public static void addNumbers(int initialN, int breakN, int breakN2, int lastN, List list) {
//        for (int i = initialN; i <= lastN; i++) {
//            if (i <= breakN && i % 2 == 0 || i >= breakN2 && i % 2 == 0)
//                list.add(i);
//        }
//    }
}
