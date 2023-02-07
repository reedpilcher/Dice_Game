package gambling;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        int user = 0;
        int opponent = 0;
        int[] blackDice = new int[] { 3, 3, 4, 4, 8, 8 };
        int[] whiteDice = new int[] { 1, 1, 5, 5, 9, 9 };
        int[] redDice = new int[] { 2, 2, 6, 6, 7, 7 };
        // introduction and title screen
        System.out.println("MAGIC DICE GAME");
        System.out.println("Play if you dare");
        // switch case with options
        System.out.println("Press 1 then enter to play!");
        Scanner firstOption = new Scanner(System.in);
        int choice = firstOption.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Let's start gambl- I mean playing the Dice Game!");
                promptEnterKey();
                break;
            }

        }
        System.out.println("Select your die!");
        System.out.println("1. The Black Dice has 3, 3, 4, 4, 8, 8");
        System.out.println("2. The White Dice has 1, 1, 5, 5, 9, 9");
        System.out.println("3. The Red Dice has 2, 2, 6, 6, 7, 7");

        Scanner dice = new Scanner(System.in);
        int dicecolor = dice.nextInt();

        switch (dicecolor) {
            case 1: {
                System.out.println("You chose the black dice, your opponent chose white!");
                promptEnterKey();
                break;
            }
            case 2: {
                System.out.println("You chose the white dice, your opponent chose red!");
                promptEnterKey();
                break;

            }
            case 3: {
                System.out.println("You chose the red dice, your opponent chose black!");
                promptEnterKey();
                break;
            }
        }

        while (user < 2 && opponent < 2) {
            if (dicecolor == 1) {
                int roll = diceRoll(blackDice);
                int enemy = opponentRoll(whiteDice);
                System.out.println("You rolled a " + roll);
                System.out.println("Your opponent rolled a " + enemy);
                if (roll > enemy) {
                    System.out.println("You won this round!");
                    user++;
                    System.out.println("opponent:" + opponent);
                    System.out.println("user:" + user);
                    promptEnterKey();
                } else {
                    System.out.println("You lost this round!");
                    opponent++;
                    System.out.println("opponent:" + opponent);
                    System.out.println("user:" + user);
                    promptEnterKey();
                }
            } else if (dicecolor == 2) {
                int roll = diceRoll(whiteDice);
                int enemy = opponentRoll(redDice);
                System.out.println("You rolled a " + roll);
                System.out.println("Your opponent rolled a " + enemy);
                if (roll > enemy) {
                    System.out.println("You won this round!");
                    user++;
                    System.out.println("opponent:" + opponent);
                    System.out.println("user:" + user);
                    promptEnterKey();
                } else {
                    System.out.println("You lost this round!");
                    opponent++;
                    System.out.println("opponent:" + opponent);
                    System.out.println("user:" + user);
                    promptEnterKey();
                }
            } else if (dicecolor == 3) {
                int roll = diceRoll(redDice);
                int enemy = opponentRoll(blackDice);
                System.out.println("You rolled a " + roll);
                System.out.println("Your opponent rolled a " + enemy);
                if (roll > enemy) {
                    System.out.println("You won this round!");
                    user++;
                    System.out.println("opponent:" + opponent);
                    System.out.println("user:" + user);
                    promptEnterKey();
                } else {
                    System.out.println("You lost this round!");
                    opponent++;
                    System.out.println("opponent:" + opponent);
                    System.out.println("user:" + user);
                    promptEnterKey();
                }
            }
        }

        if (user > opponent) {
            System.out.println("YOU WON!!!!!!!");
        } else {
            System.out.println("YOU LOST!!!!!!");
        }

    }

    // 1. play game
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

    private static int diceRoll(int[] array1) {
        Random userRoll = new Random();
        // Random opponentRoll = new Random();
        int userindex = userRoll.nextInt(array1.length);
        // int opponentindex = userRoll.nextInt(array2.length);
        int userNum = array1[userindex];
        return userNum;
    }
    // int opponentNum = array2[opponentindex];

    static int opponentRoll(int[] array2) {
        Random opponentRoll = new Random();
        int opponentindex = opponentRoll.nextInt(array2.length);
        int opponentNum = array2[opponentindex];
        return opponentNum;
    }

    // method to simplify promting user to press enter
    private static void promptEnterKey() {
        System.out.println("Press ENTER to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
