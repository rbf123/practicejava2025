import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        // .substring() = method used to extract a portion of a string .substring(start, end)

        email = scanner.nextLine();

        // String username = email.substring(0, 6); //2nd index is exclusive

       if (email.contains("@")){

           username = email.substring(0, email.indexOf("@"));
           // String domain = email.substring(7,16); // don't necessarily need end index
           domain = email.substring(email.indexOf("@") + 1); // don't necessarily need end index

           System.out.println(username);
           System.out.println(domain);
       } else {
           System.out.println("Emails must contain @");
       }




        scanner.close();



    }

}

