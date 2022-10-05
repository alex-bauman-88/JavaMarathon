/*5. Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
чтобы участники были - объекты класса MusicArtist.

После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
*/
package day12.task5;

public class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
