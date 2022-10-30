/* 2. Реализовать программу, записывающую числа разных типов в 2 файла.
Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.

Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их
среднее арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2
будет находиться 50 вещественных чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную часть.

Пример:
Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.

Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
Файл 2: 5.75 26.5 34.5
Ответ: 66

Комментарии к примеру:
Среднее арифметическое для четверки 3 8 7 5 равно 5.75
Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
Сумма вещественных чисел из Файла 2 равняется 66.75
Отбросив вещественную часть (числа после запятой) получаем ответ 66.  */
package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        printResult(file2);

        try {
            PrintWriter file1Write = new PrintWriter(file1);
            Random random = new Random();
            for (int i = 0; i < 1000; i++)
                file1Write.println(random.nextInt(100));

            file1Write.close();

            Scanner scannerFile2 = new Scanner(file1);
            PrintWriter file2Write = new PrintWriter(file2);

            int counter = 0;
            int sum20 = 0;

            while (scannerFile2.hasNextLine()) {
                counter++;
                sum20 += Integer.parseInt(scannerFile2.nextLine());

                if (counter % 20 == 0) {
                    file2Write.println((double) sum20 / 20);
                    sum20 = 0;
                }
            }
            file2Write.close();
            scannerFile2.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    static void printResult(File file) {
        try {
            Scanner scanner1 = new Scanner(file);
            double sumResult = 0;
            while (scanner1.hasNextLine())
                sumResult += Double.parseDouble(scanner1.nextLine());

            System.out.println((int) sumResult);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
