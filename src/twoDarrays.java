public class twoDarrays {


    public static void main(String[] args) {

        char [][] telephone = {{'1','2','3'},
                                {'4', '5', '6'},
                                {'7','8','9'},
                                {'*', '0', '#'}};


        for(char[] row: telephone){
        for (char number: row){
            System.out.print(number+ " ");
        }
        System.out.println();

        }
    }



        /*
            //varargs = allow a method to accept a varying number of arguments
        // makes methods more flexible, no need for overloaded methods, java will pack the arguments into array
        // ... (ellipsis)

        // 2D array = An array where each element is an array, useful for storing a matrix of data

            String [] fruits = {"apple", "orange", "banana"};
            String [] vegetables = {"potato", "onion", "carrot"};
            String [] meats = {"chicken", "pork", "beef", "fish"};

            // you can make an array made of arrays by combining them all into a 2D array, groceries is matrix of data

            String [][] groceries = {{"apple", "orange", "banana"}, vegetables, meats};

            // to change data use two indices []

            groceries[0][0] = "pineapple";
            groceries[1][0] = "celery";


            for (String[] foods: groceries) {
                for(String food: foods) {
                    System.out.print(food + " ");
                }

                System.out.println();
            }


         */

            }















