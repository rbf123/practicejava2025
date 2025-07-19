public class overloadedmethods {

        public static void main (String[] args) {

            //overloaded methods = methods that share the same name, but diff parameters
            // signature = name + parameters
            // if there are more methods with the same name, they will use the one where the parameters match

            String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");

            System.out.println(pizza);

        }
            static String bakePizza(String bread){
                return bread + " pizza";
            }
            static String bakePizza(String bread, String cheese){
                return cheese + " " + bread + " pizza";
            }
            static String bakePizza(String bread, String cheese, String topping){
                return topping + " " + cheese + " " + bread + " pizza";
            }




            /*
            System.out.println(add(1, 2, 3));

        }
            static double add(double a, double b) {
                return a + b;
            }
            static double add(double a, double b, double c){
                return a + b + c;
            }

             */
        }










