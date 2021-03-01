package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > 0) {
            System.out.println("Игрок бежит");
            stamina--;
            if (stamina <= 0) {
                System.out.println("Игрок устал");
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers >= 0 && countPlayers < 6) {
            int difference;
            difference = 6 - countPlayers;
            if (difference == 1) {
                System.out.println("Команды неполные. На поле есть еще одно свободное место");
            } else if (difference == 2 || difference == 3 || difference == 4) {
                System.out.println("Команды неполные. На поле есть еще " + difference + " свободных места");
            } else {
                System.out.println("Команды неполные. На поле есть еще " + difference + " свободных мест");
            }
        } else if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("Значения количества игроков не может быть отрицательным");
            countPlayers = 0;
        }
    }
}
