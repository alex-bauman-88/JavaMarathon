/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

Рекомендация:
Для поиска наибольшего и наименьшего элемента массива переменные, которые будут хранить эти значения необходимо
либо инициализировать уже после заполнения массива, первым элементом этого массива
max =arr[0]
min = arr{0]
либо до массива, но самым "крайним" числом в диапазоне, т.е.
max = Integer.MIN_VALUE
min = Integer.MAX_VALUE
Это максимально универсальный подход.


*/
package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[100];
        for (int i = 0; i < 100; i++) {
            arrayNumbers[i] = (int) Math.floor(Math.random() * 10000);
            System.out.println(arrayNumbers[i]);
        }
        int min = arrayNumbers[0];
        int max = arrayNumbers[0];

        for (int arrayNumber : arrayNumbers) {
            if (arrayNumber > max)
                max = arrayNumber;
        }
        for (int arrayNumber : arrayNumbers) {
            if (arrayNumber < min)
                min = arrayNumber;
        }
//        ТО ЖЕ, ЧТО ВЫШЕ, НО ДРУГОЙ FOR
//        for (int i = 0; i < arrayNumbers.length; i++) {
//            if (arrayNumbers[i] < min)
//                min = arrayNumbers[i];
//        }
        System.out.println("Max: " + max + ", min: " + min);

        int multiples10 = 0;
        int multiples10sum = 0;
        for (int arrayNumber : arrayNumbers){
            if (arrayNumber % 10 == 0){
                multiples10++;
                multiples10sum = multiples10sum + arrayNumber; // multiples10sum += arrayNumber;
            }
        }
        System.out.println("Multiples of 10: " + multiples10 + "; sum of them: " + multiples10sum);
    }
}
