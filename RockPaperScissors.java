import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your choice (rock, paper, scissors, quit): ");
            String playerChoice = scanner.nextLine();

            if (playerChoice.equals("quit")) {
                break;
            }

            int computerChoice = random.nextInt(3);
            String[] choices = {"rock", "paper", "scissors"};
            String computerChoiceString = choices[computerChoice];

            System.out.println("Computer choice: " + computerChoiceString);

            if (playerChoice.equals(computerChoiceString)) {
                System.out.println("It's a tie!");
            } else if (
                    (playerChoice.equals("rock") && computerChoiceString.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoiceString.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoiceString.equals("rock"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        scanner.close();
    }
}
