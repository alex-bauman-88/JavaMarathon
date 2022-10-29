/*
1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
Заполнить его вручную десятью произвольными числами. Реализовать статический метод printSumDigits(File file),
который считает сумму всех чисел в этом файле и выводит ее на экран.
Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль
сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать
исключение и выводить в консоль сообщение “Некорректный входной файл”.
Вызвать данный метод в методе main().

*/
package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Day14Task1TestFile");
        printSumDigits(file);
    }

    static void printSumDigits(File file) {

        List<Integer> numbers = new ArrayList<>();

        Scanner scanner1 = null;

        try {
            scanner1 = new Scanner(file);  // в файле числа в столбик

            while (scanner1.hasNextLine()) {
                numbers.add(Integer.parseInt(scanner1.nextLine()));
            }
            if (numbers.size() != 10)
                throw new IOException("Invalid input file");

            int sum = 0;
            for (Integer i : numbers)
                sum += i;

            System.out.println("The sum is: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner1 != null) {
                scanner1.close();
            }
        }
    }
}
