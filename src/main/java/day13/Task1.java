/*Класс Task1:

В методе main() этого класса необходимо создать трех пользователей.
Затем необходимо:
Отправить 2 сообщения от пользователя 1 пользователю 2--
Отправить 3 сообщения от пользователя 2 пользователю 1--
Отправить 3 сообщения от пользователя 3 пользователю 1--
Отправить 3 сообщения от пользователя 1 пользователю 3
Отправить 1 сообщение от пользователя 3 пользователю 1

Сообщения могут быть любыми.
После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
*/

package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Bob");
        User user3 = new User("Sam");

        user1.sendMessage(user2, "Hi Bob");
        user1.sendMessage(user2, "How are you doing");
        user2.sendMessage(user1, "Hi John");
        user2.sendMessage(user1, "I'm doing great");
        user2.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "John!");
        user3.sendMessage(user1, "Long time no see");
        user3.sendMessage(user1, "Are you going to come back home?");
        user1.sendMessage(user3, "Night, Sam");
        user1.sendMessage(user3, "I'm not coming back until next summer");
        user1.sendMessage(user3, "Sorry");
        user3.sendMessage(user1, "Ok, I got you");

        MessageDatabase.showDialog(user1, user3);
    }
}
