import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;



public class Main {


    public static void main(String[] args) {

      // Inheritance = One class inherits the attributes and methods from another class
        // child <- parent

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

        //circle.display();
        //triangle.display();
        //rectangle.display();


    }


}











