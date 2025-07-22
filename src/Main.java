import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;



public class Main {


    public static void main(String[] args) {


        // Object = An entity that holds data (attributes) and can perform actions (methods), reference data type
        // constructor = A special method to initialize objects, you can pass arguments to a constructor and set up initial value
        // overloaded constructors = Allow a class to have multiple constructors with different parameter lists,
        //                            enable objects to be initialized in various ways

        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "pstar@aol.com");
        User user3 = new User("Sandy", "scheeks@gmail.com", 27);
        User user4 = new User();


        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }


}











