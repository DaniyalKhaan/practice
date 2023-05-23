import java.util.Random;
import java.util.Scanner;

public class guessingNumberGame {
  
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int secretNumber = rand.nextInt(100) + 1;
            int guess;
    
            System.out.println("Welcome to the guessing game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
    
            while(true) {
                System.out.print("Your guess: ");
                guess = sc.nextInt();
    
                if(guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number!");
                    break;
                } else if(guess < secretNumber) {
                    System.out.println("The number is higher.");
                } else {
                    System.out.println("The number is lower.");
                    sc.close();
                }
            }
        }
    }
    
    

