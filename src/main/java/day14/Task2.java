/* 2. Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей.
Реализовать статический метод  List<String> parseFileToStringList(File file),
который считывает содержимое этого файла и возвращает список, состоящий из значений
имен и возрастов каждого человека. Получить данный список в методе main() и распечатать его в консоль.

В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и
выводить в консоль сообщение “Файл не найден”.

Помимо этого, если значение возраста отрицательно,
необходимо выбрасывать исключение, выводить в консоль сообщение “Некорректный входной файл” и
возвращать null или пустой список.

Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]

Пример содержания файла people.txt:
Mike 24
John 19
Anna 20
Miguel 5
*/

package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("people.txt");
        System.out.println(parseFileToStringList(file1));
    }

    static List<String> parseFileToStringList(File file) {

        List<String> listOfPeople = new ArrayList<>();

        try {
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                String person = scanner1.nextLine();
                listOfPeople.add(person);

                String[] ageCheck = person.split(" ");
                if (Integer.parseInt(ageCheck[1]) < 0)
                    throw new IOException("Invalid input file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            listOfPeople.clear();
        }
        return listOfPeople;
    }
}
