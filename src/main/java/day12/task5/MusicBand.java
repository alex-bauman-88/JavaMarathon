/*5. Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
чтобы участники были - объекты класса MusicArtist.

После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
*/
package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> bandMembers;

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<MusicArtist> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public MusicBand(String name, int year, List<MusicArtist> bandMembers) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMembers;
    }

    public void printMembers() {
        System.out.println(getMembers());
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        List<MusicArtist> unitedBand1 = new ArrayList<>(band1.getMembers());
        List<MusicArtist> unitedBand2 = new ArrayList<>(band2.getMembers());
        unitedBand2.addAll(unitedBand1);
        band1.setBandMembers(null);
        band2.setBandMembers(unitedBand2);
    }
}
