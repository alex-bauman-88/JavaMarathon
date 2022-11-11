/*   1. Реализовать программу, которая на вход принимает txt файл с целыми числами
(можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в консоль
среднее арифметическое этих чисел.
Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись
вещественного числа (со всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).

Детали реализации: В классе Task1 создать публичный статический метод printResult(File file),
в котором реализовать вышеописанную логику. В методе main() класса Task1 вызвать метод printResult(File file),
передав ему в качестве аргумента объект класса File (txt файл с целыми числами).
Возникающие исключения обрабатывать внутри метода.

Пример:
Числа в txt файле: 5 2 8 34 1 36 77
Ответ: 23.285714285714285 --> 23.286   */
package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File fileIn = new File("src" + separator + "main" + separator + "java" + separator + "day16" + separator + "Day16Task1TestFile");
        printResult(fileIn);

    }

    public static void printResult(File file) {

        try (Scanner scanner1 = new Scanner(file)) {
            String[] numbersString;

            if (scanner1.hasNextLine())
                numbersString = scanner1.nextLine().split(" ");
            else
                throw new IOException("Invalid file");

            int sum = 0;
            for (String numbers : numbersString) {
                sum += Integer.parseInt(numbers);
            }
            double arithmeticAverage = (double) sum / numbersString.length;
            System.out.printf(arithmeticAverage + " --> %.3f", arithmeticAverage);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

