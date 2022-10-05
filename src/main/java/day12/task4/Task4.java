/*4.  Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было
добавлять и удалять участников списком (по несколько участников за раз, а не по одному).
Под участником понимается строка (String) с именем и фамилией.

Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
Название метода: transferMembers.
Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.

В классе MusicBand, реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список участников.

Проверить состав групп после слияния.
*/

package day12.task4;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Band1", 1978, Arrays.asList("Jack Doe", "Joe Black", "Bob Singer"));
        MusicBand band2 = new MusicBand("Band2", 2034, Arrays.asList("Marty McFly", "Harry Nelsen", "George Bound"));

        band1.printMembers(); // [Jack Doe, Joe Black, Bob Singer]
        band2.printMembers(); // [Marty McFly, Harry Nelsen, George Bound]

        band1.transferMembers(band1, band2);
        band1.printMembers(); // null
        band2.printMembers(); // [Marty McFly, Harry Nelsen, George Bound, Jack Doe, Joe Black, Bob Singer]

    }
    }
