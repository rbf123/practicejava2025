import java.util.Scanner;

public class enhancedswitch {

    public static void main (String[] args){

        // Enhanced switch = a replacement to many else if statements (java 14 feature)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday",  "Friday" ->
                System.out.println("It is a weekday lol");
            case "Saturday", "Sunday" ->
                System.out.println("It is the weekend yay");
            default -> System.out.println(day + " is not a day");
        }

    }

}

