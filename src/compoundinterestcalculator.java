 import java.util.Scanner;



public class compoundinterestcalculator {

    public static void main (String[] args){

        // compound interest calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate amount in %: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter number of years: ");
        years = scanner.nextInt();

        amount = (principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years));

        System.out.println("The amount is $" + amount + " after " + years + " years.");





        scanner.close();


    }

}

