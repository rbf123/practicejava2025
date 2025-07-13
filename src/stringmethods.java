import java.util.Scanner;

public class stringmethods {

    public static void main (String[] args){

      Scanner scan = new Scanner(System.in);

      System.out.println("Please enter your name: ");
      String name =  scan.nextLine();

      int length = name.length(); // length of name
      char letter = name.charAt(0); // letter or character at that value
      int index = name.indexOf(letter); // find the index
      int lastIndex = name.lastIndexOf(letter); // find the last index or where is that exactly


      name = name.toUpperCase();
      System.out.println(name);

      name = name.toLowerCase();
      System.out.println(name);

      name = name.trim(); // removes whitespace

      name = name.replace("u", "a"); // changes char


        if (name.isEmpty()){

          System.out.println("Your name is empty");
      } else {
          System.out.println("Your name is " + name);
      }

      //check if string contains a character

      if (name.contains(" ")) {
          System.out.println("Your name contains spaces");
      } else {
          System.out.println("Your name doesn't contain spaces");
      }




      if (name.equals("password")){
          System.out.println("Your name can't be password");
      } else {
          System.out.println("Hello " + name);
      }



      System.out.println(length);




        scan.close();


    }

}

