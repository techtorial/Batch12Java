package varibales;

public class VariablePractice {

    public static void main(String[] args) {
        // declaring variable        initializing variable(giving value)
        int yellowApples = 4;
        int greenApples = 5;
        int oranges = 1;
        //  int yellowApples = 2; you cannot create a new variable by using same name
        // but you can reassign it
        System.out.println(yellowApples + greenApples + oranges);
        int fruits = yellowApples + greenApples + oranges;
        System.out.println(fruits);
        System.out.println(yellowApples); // 500

        yellowApples = 3; // reassignment
        System.out.println(yellowApples); // 300

        /*
        yellow apples are 2 dollar each, green apples are 3 dollars each and oranges are 5 dollars each
        create variables to represent these costs of each fruit and
        calculate total cost of fruits and print it
         */
        int yellowApple$ = 2;
        int greenApples$  = 3;
        int orange$ =5;

        System.out.println("$"  +  (yellowApples * yellowApple$ + greenApples * greenApples$ + oranges   *   orange$ )); // total cost

        int totalCost = (yellowApples * yellowApple$ + greenApples * greenApples$ + oranges   *   orange$);
        System.out.println("Total cost of fruits is $"+ totalCost );

int x = 5;
        System.out.println(6);
        System.out.println(6);
        System.out.println(5);
        System.out.println(5);
        System.out.println(5);
        System.out.println(5);


    }

}
