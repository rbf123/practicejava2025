public class ternaryoperator {

    public static void main (String[] args){

       // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue ; ifFalse;

        /* int score = 70;

         if(score >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        String passOrFail = (score >= 60) ?  "PASS" : "FAIL";

        System.out.println(passOrFail);

        int number = 3;

        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";

        System.out.println(evenOrOdd); */

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);

    }

}

