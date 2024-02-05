import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "S"};
            String compMove = rps[new Random().nextInt(rps.length)];


            String playerMove;

            while (true) {
                System.out.println("Enter your move (r, p or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println("Hey! " + playerMove + " is not a valid move!");
            }

            System.out.println("Computer played: " + compMove);

            if (playerMove.equals(compMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equals("r")) {
                if (compMove.equals("p")) {
                    System.out.println("You lost :(");
                } else if (compMove.equals("s")) {
                    System.out.println("You Win! :)");
                }
            } else if (playerMove.equals("p")) {
                if (compMove.equals("s")) {
                    System.out.println("You lost :(");
                } else if (compMove.equals("r")) {
                    System.out.println("You Win! :)");
                }
            } else {
                if (compMove.equals("r")) {
                    System.out.println("You lost :(");
                } else if (compMove.equals("p")) {
                    System.out.println("You Win! :)");
                }
            }

            System.out.println("Play again? (y=yes, n=no)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }

    }
}