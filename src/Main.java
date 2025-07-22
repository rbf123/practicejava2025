import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;



public class Main {


    public static void main(String[] args) {

      // static = Keyword, Makes a variable or method belong ot th class rather than to any specific object
        // commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Plankton");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Bob");
        Friend friend5 = new Friend("Sally");

        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);

        Friend.showFriends();

        System.out.println(Math.round(3.78));
    }


}











