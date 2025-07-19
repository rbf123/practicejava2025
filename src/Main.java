import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //nested loop = a loop inside another loop, used often with matrices of DS&A

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);


        for (int i = 1; i <= rows; i++) {
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }




        scanner.close();



        /*
        for (int i = 1; i <= 3; i++){
            for(int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }





        for(int i = 1; i <= 9; i++) {
        System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // break = break out of a loop (STOP)
        //continue = skip current iteration of a loop (SKIP)


        for (int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }

            System.out.print(i + " ");
        }

         */

        }

    }



