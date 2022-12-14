/*3. *Выполнять в подпапке task3 в day12*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы, которые
были созданы как до 2000 года, так и после, жанр не важен).

Перемешать список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)

Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года.
Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп. Вывести в консоль оба списка
(оригинальный и с группами, основанными после 2000 года).
*/

package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bandList = new ArrayList<>();

        bandList.add(new MusicBand("Band1", 1978));
        bandList.add(new MusicBand("Band2", 1998));
        bandList.add(new MusicBand("Band3", 2000));
        bandList.add(new MusicBand("Band4", 2055));
        bandList.add(new MusicBand("Band5", 1957));
        bandList.add(new MusicBand("Band6", 1970));
        bandList.add(new MusicBand("Band7", 2002));
        bandList.add(new MusicBand("Band8", 2005));
        bandList.add(new MusicBand("Band9", 2012));
        bandList.add(new MusicBand("Band10", 2015));

        System.out.println(bandList);
        Collections.shuffle(bandList);
        System.out.println(bandList);

        System.out.println(groupsAfter2000(bandList));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bands2000AndLater = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000)
                bands2000AndLater.add(band);
        }
        return bands2000AndLater;
    }
}
