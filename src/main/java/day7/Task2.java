/*2. Дворовый футбол.
Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит следующие поля:
Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость”
(англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.

Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0, выходом
на поле считается создание экземпляра класса, уходом - когда игрок устал).
Геттеры для полей “выносливость” и “количество игроков”.

и следующие методы:
run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит сообщение:
“Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.

Задание: Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random, который будет
генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно
сгенерированные числа от 90 до 100. Вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на
поле меняться не должно, проверить это.
Примените к одному игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается).
Вывести количество игроков на поле.

*По желанию: доработать метод info() так, чтобы при выводе в консоль грамматика русского языка учитывалась.
*/

package day7;

import java.util.Random;

import static day7.Player.MAX_STAMINA;
import static day7.Player.MIN_STAMINA;

public class Task2 {
    public static void main(String[] args) {
        Random randomStamina = new Random();

        Player player1 = new Player((randomStamina.nextInt(10)) + 90);
        Player player2 = new Player((randomStamina.nextInt(10)) + 90);
        Player player3 = new Player((randomStamina.nextInt(10)) + 90);

        Player.info(); // Football team is incomplete. There are still 3 vacant place(s) on the football field, total number of players is 3

        Player player4 = new Player((randomStamina.nextInt(10)) + 90);
        Player player5 = new Player((randomStamina.nextInt(10)) + 90);
        Player player6 = new Player((randomStamina.nextInt(10)) + 90);
        Player player7 = new Player((randomStamina.nextInt(10)) + 90);

        Player.info(); // No vacant places on the football field, total number of players is 7, 6 of them are on the field

        for (int i = 0; i < MAX_STAMINA; i++)
            player1.run();

        Player.info(); // Football team is incomplete. There are still 1 vacant place(s) on the football field, total number of players is 7

    }
}
