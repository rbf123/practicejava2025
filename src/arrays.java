import java.util.Arrays;


public class arrays {


    public static void main(String[] args) {

            //array = a collection of values of the same data type
        // think of it as a variable that can store more than 1 value

            String [] fruits = {"apple", "orange", "banana", "kiwi"};

            //fruits[0] = "pineapple";
            //int numOfFruits = fruits.length;

           // for (int i = 0; i < fruits.length; i++) {
           //     System.out.println(fruits[i]);
           // }
            Arrays.sort(fruits); // sort the fruits alphabetically
            // Arrays.fill(fruits, "pineapple");; // fill the array with the value of pineapple

            for (String fruit : fruits) {
                System.out.println(fruit);
            }



        }




}






