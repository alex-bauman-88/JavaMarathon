/* Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
в качестве разделителя использован символ “;”). В этом файле содержится информация о названии
модели обуви, ее размер и оставшееся на складе количество.

До преобразования в csv это была таблица с тремя колонками:

    Название                                      Размер       Кол-во
    Ботинки HS РАН-Р 400 чер. ЗП                  45           4
    Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.       37           1
    ...

Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о
моделях и размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте программу,
которая принимает на вход csv файл и создает новый txt файл следующего содержания (должно получиться 11 строк):

    Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
    Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
    Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
    ...
Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
Учтите ситуацию, когда в файле может быть содержимое отличное от ожидаемого. В нашем случае файл один
и он корректен, но гипотетически может быть подан пустой файл или кол-во столбцов отличаться от трех. */

package day15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File fileIn = new File("src" + separator + "main" + separator + "resources" + separator + "shoes.csv");
        File fileOut = new File("src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt");

        Scanner scanner1 = null;
        PrintWriter printWriter = null;

        try {
            scanner1 = new Scanner(fileIn);
            printWriter = new PrintWriter(fileOut);

            while (scanner1.hasNextLine()) {
                String[] oneLine = scanner1.nextLine().split(";");

                if (oneLine.length != 3)
                    throw new IOException("Invalid input file");

                if (Integer.parseInt(oneLine[2]) == 0)
                    printWriter.println(oneLine[0] + ", " + oneLine[1] + ", " + oneLine[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (printWriter != null)
                printWriter.close();
            if (scanner1 != null)
                scanner1.close();
        }
    }
}
