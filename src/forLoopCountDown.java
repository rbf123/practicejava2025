import java.util.Scanner;

public class forLoopCountDown {

    public static void main (String[] args) throws InterruptedException {

        //for loop = execute some code a CERTAIN amount of times
        // for (initialization or counter usually named i ; condition you want to stop; update to your counter)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number seconds to count down from:");

        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR!");


       scanner.close();




        /*
        System.out.print("Enter how many times you want to loop:");
        int max = scanner.nextInt();

        for(int i = 0; i <= max; i++ ){
            System.out.println(i);
        }

        /*
        for (int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }
        */

        }

    }



