/*3. Создать класс “Человек” с полями “имя” и “возраст”.
Реализовать статический метод List<Person> parseFileToObjList(File file),
который считывает содержимое того же файла people.txt, создает экземпляры класса “Человек”
и возвращает список объектов. Получить данный список в методе main() и распечатать его в консоль.

В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение
и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.

Пример ответа:
[{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]
*/


package day14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file1 = new File("people.txt");
        System.out.println(parseFileToObjList(file1));
    }

    static List<Person> parseFileToObjList(File file) {
        List<Person> personList = new ArrayList<>();
        Scanner scanner1 = null;

        try {
            scanner1 = new Scanner(file);

            while (scanner1.hasNextLine()) {
                String[] singlePerson = scanner1.nextLine().split(" ");
                personList.add(new Person(singlePerson[0], Integer.parseInt(singlePerson[1])));
                if (Integer.parseInt(singlePerson[1]) < 0)
                    throw new IOException("Invalid input file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            personList.clear();
        } finally {
            if (scanner1 != null)
                scanner1.close();
        }
        return personList;
    }
}
