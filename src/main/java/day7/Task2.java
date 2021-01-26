package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        Player player1 = new Player(1);
        Player player2 = new Player(10);
        Player player3 = new Player(10);
        Player player4 = new Player(10);
        Player player5 = new Player(i);
        Player player6 = new Player(i);

        Player.info();
        while (player1.getStamina() > 0){
            player1.run();
    }
        Player.info();


    }
}
