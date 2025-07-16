import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

    public static void main (String[] args){


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess any number between %d-%d\n", min, max);

        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts ++;

            if (guess < randomNumber) {
                System.out.println("Too low, try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Congratulations, you guessed it! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }



        } while(guess != randomNumber);

        System.out.println("You won");
        System.out.println("You guessed the number between 1 and 10, which was " + randomNumber);


        scanner.close();


        }

    }



