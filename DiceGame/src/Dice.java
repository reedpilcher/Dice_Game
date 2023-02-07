
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) throws Exception {
        int[] blackDice = new int[] { 3, 3, 4, 4, 8, 8 };
        int[] whiteDice = new int[] { 1, 1, 5, 5, 9, 9 };
        int[] redDice = new int[] { 2, 2, 6, 6, 7, 7 };
        // introduction and title screen
        System.out.println("MAGIC DICE GAME");
        System.out.println("Play if you dare");
        // switch case with options
        Scanner firstOption = new Scanner(System.in);
        int choice = firstOption.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("How many rounds would you like to play?\n3 Rounds\n5 Rounds\n7 Rounds");
                Scanner rounds = new Scanner(System.in);
                int play = rounds.nextInt();
                switch (play) {
                    case 3: {
                        System.out.println("You have selected 3 rounds!");

                    }
                    case 5: {
                        System.out.println("You have selected 5 rounds!");
                    }
                    case 7: {
                        System.out.println("You have selected 7 rounds!");
                    }
                }

            }

        }
        // 1. play game
        // maybe a nested swith case for best of 3, 5, or 7
        // 2. learn rules
        // simple well formatted rules for how to play game
        // 3. exit

        // three dice arrays
        /*
         * The Black Dice has 3, 3, 4, 4, 8, 8
         * The White Dice has 1, 1, 5, 5, 9, 9
         * The Red Dice has 2, 2, 6, 6, 7, 7
         */

        // include a for loop to count who won each round
        // if statement with counter to determine the winner

    }
}
