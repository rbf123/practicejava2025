import java.util.Scanner;


public class enteruserinputarray {


    public static void main(String[] args) {

            // can't make an array with empty elements {}, won't be able to assign any values it will be array out of bounds error

               Scanner scanner =  new Scanner(System.in);


               String[] foods;
               int size;

               System.out.println("Number of food you want: ");
               size = scanner.nextInt();
               scanner.nextLine();

               foods = new String[size];


               for (int i = 0; i < foods.length; i++) {
                   System.out.println("Enter food: ");
                   foods[i] = scanner.nextLine();
               }

                for (String food : foods) {
                    System.out.println(food);
                }

                scanner.close();
                /*
            String [] foods = new String[3];

            foods[0] = "pizza";
            foods[1] = "taco";
            foods[2] = "hamburger";

            for (String food : foods) {
                System.out.println(food);
            }
                 */





            }



        }











