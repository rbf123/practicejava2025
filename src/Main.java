import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;



public class Main {


    public static void main(String[] args) {


        // Object = An entity that holds data (attributes) and can perform actions (methods), reference data type
        // constructor = A special method to initialize objects, you can pass arguments to a constructor and set up initial value

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);
        Student student3 = new Student("Sandy", 27, 4.0);

        student1.study();
        student2.study();
        student3.study();

        /*
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        */
    }


}











