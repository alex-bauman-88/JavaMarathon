
package day7;

public class Player {
    private int stamina;
    public static int countPlayers;
    public static int countPlayersAbs; // число игроков в целом, в т.ч. которые не на поле, мне для лучшего понимания задачи

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static int getCountPlayersAbs() {
        return countPlayersAbs;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayersAbs++;
        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Football team is incomplete. There are still " + (6 - getCountPlayers()) +
                    " vacant place(s) on the football field, total number of players is " + getCountPlayersAbs());
        } else {
            System.out.println("No vacant places on the football field, total number of players is " + getCountPlayersAbs() +
                    ", " + getCountPlayers() + " of them are on the field");
        }
    }
}
