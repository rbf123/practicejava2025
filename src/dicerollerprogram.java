import java.util.Random;
import java.util.Scanner;


public class dicerollerprogram {


    public static void main(String[] args) {

        //JAVA DICE ROLLER PROGRAM

        //DECLARE VARIABLES

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numofDice;
        int total = 0;


        //GET # OF DICE FROM USER
        System.out.print("Enter the number of dice to roll: ");
        numofDice = scanner.nextInt();


        // CHECK IF # OF DICE > 0
        if (numofDice > 0) {

            for(int i = 0; i < numofDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled " + roll);
                total = total + roll;
            }

            System.out.println("Total: " + total);


        } else {
            System.out.println("Number of dice must be greater than zero");
        }

        // ROLL ALL THE DICE

        scanner.close();

        }

        static void printDie(int roll){

            String dice1 = """
                        _______           \s
                      /\\       \\          \s
                     /()\\   ()  \\         \s
                    /    \\_______\\        \s
                    \\    /()     /        \s
                     \\()/   ()  /         \s
                      \\/_____()/
                    
                    
                    """;

            String dice2 = """
                        _______           \s
                      /\\  ()   \\          \s
                     /  \\   ()  \\         \s
                    /    \\_______\\        \s
                    \\    /()     /        \s
                     \\  /   ()  /         \s
                      \\/_____()/
                    
                    
                    """;

            String dice3 = """
                        _______           \s
                      /\\  ()   \\          \s
                     /  \\   ()  \\         \s
                    /    \\____()_\\        \s
                    \\    /()     /        \s
                     \\  /       /         \s
                      \\/_____()/
                    
                    
                    """;

            String dice4 = """
                        _______           \s
                      /\\()  () \\          \s
                     /  \\       \\         \s
                    /    \\()___()\\        \s
                    \\    /()     /        \s
                     \\  /   ()  /         \s
                      \\/_____()/
                    
                    
                    """;

            String dice5 = """
                        _______           \s
                      /\\()  () \\          \s
                     /  \\  ()   \\         \s
                    /    \\()___()\\        \s
                    \\    /()     /        \s
                     \\  /   ()  /         \s
                      \\/_____()/
                    
                    
                    """;

            String dice6 = """
                        _______           \s
                      /\\()  () \\          \s
                     /  \\()   ()\\         \s
                    /    \\()___()\\        \s
                    \\    /()     /        \s
                     \\  /   ()  /         \s
                      \\/_____()/
                    
                    
                    
                    
                    """;

            switch(roll){
                case 1 -> System.out.print(dice1);
                case 2 -> System.out.print(dice2);
                case 3 -> System.out.print(dice3);
                case 4 -> System.out.print(dice4);
                case 5 -> System.out.print(dice5);
                case 6 -> System.out.print(dice6);
                default -> System.out.print("Invalid roll");
            }

        }




}






