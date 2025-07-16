import java.util.Scanner;

public class whileloops {

    public static void main (String[] args){

        //while loop = repeats some code forever
        //              while some condition remains true

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(number <1 || number > 10){
            System.out.println("Please enter a number between 1 and 10");
            number = scanner.nextInt();
        }

        System.out.println("You picked " + number);


        /*
        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0){
            System.out.print("Invalid age. Your age can't be negative. \n" );
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }




        System.out.println("You are " + age + " years old.");








        String name = "";

        while(name.isEmpty()){


            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }



        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");



         */
        scanner.close();



        }

    }



