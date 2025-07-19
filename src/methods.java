public class methods {

    public static void main (String[] args) {

        //method = a block of reusable code that is executed when called ()

        int age = 21;

        if(ageCheck(age)){
            System.out.println("You can sign up");
        } else {
            System.out.println("You can't sign up");
        }

        /*double result = cube(3);
        //System.out.println(result);

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

         */
    }

        static double square(double number){
            return number * number;
        }
        static double cube(double number){
            return number * number * number;
        }
        static String getFullName(String first, String last){
            return first + " " + last;
        }
        static boolean ageCheck(int age){
            if(age >= 18){
            return true;
        } else {
            return false;}
        }
    }


        /*
        String name = "bram";
        int age = 30;

        happyBirthday(name, age);
        happyBirthday(name, age);
    }

        static void happyBirthday(String name, int age) {
            System.out.println("Happy Birthday to you!");
            System.out.printf("Happy Birthday dear %s!\n", name);
            System.out.printf("You are %d years old!\n", age);
            System.out.println("Happy Birthday to you!\n");
        }


         example make a method instead of
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");
         */








