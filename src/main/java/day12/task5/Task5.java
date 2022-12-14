/*5. Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
чтобы участники были - объекты класса MusicArtist.

После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
*/

package day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Band1", 1978,
                Arrays.asList(new MusicArtist("Jack Doe", 29), new MusicArtist("Joe Black", 57), new MusicArtist("Bob Singer", 98)));
        MusicBand band2 = new MusicBand("Band2", 2034,
                Arrays.asList(new MusicArtist("Marty McFly", 15), new MusicArtist("Harry Nelsen", 23), new MusicArtist("George Bound", 20)));

        band1.printMembers(); // [Jack Doe - 29, Joe Black - 57, Bob Singer - 98]
        band2.printMembers(); // [Marty McFly - 15, Harry Nelsen - 23, George Bound - 20]

        band1.transferMembers(band1, band2);
        band1.printMembers(); // null
        band2.printMembers(); // [Marty McFly - 15, Harry Nelsen - 23, George Bound - 20, Jack Doe - 29, Joe Black - 57, Bob Singer - 98]
    }
}
