/*4.  Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было
добавлять и удалять участников списком (по несколько участников за раз, а не по одному).
Под участником понимается строка (String) с именем и фамилией.

Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
Название метода: transferMembers.
Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.

В классе MusicBand, реализовать
метод printMembers(), печатающий список участников в консоль и метод getMembers(), возвращающий список участников.

Проверить состав групп после слияния.
*/
package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> bandMembers;

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<String> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public MusicBand(String name, int year, List<String> bandMembers) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMembers;
    }

    public void printMembers() {
        System.out.println(getMembers());
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        List<String> unitedBand1 = new ArrayList<>(band1.getMembers());
        List<String> unitedBand2 = new ArrayList<>(band2.getMembers());
        unitedBand2.addAll(unitedBand1);
        band1.setBandMembers(null);
        band2.setBandMembers(unitedBand2);
    }
}
