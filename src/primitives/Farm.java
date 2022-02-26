package primitives;

public class Farm {

    public static void main(String[] args) {

        /*
        1- calculate number of the legs in the farm if:
        there are 23 cows and 13 chickens at this farm
        show total number of legs as final result
         */

        int cows = 23;
        int chickens = 13;

        int cowLegs = 4;
        int chickenLegs = 2;

        int totalLegs = cows * cowLegs + chickens * chickenLegs;
        System.out.println(totalLegs);
        System.out.println("Total number of the legs in this farm is: "+totalLegs);
        System.out.println("======================");

        /*
        2- calculate the cost of all animals in this farm if:
        each cow cost 1200$ and each chicken cost 15.99$
        show total cost of all animals
         */
        double cow$ = 1200;
        double chicken$  = 15.99;


        double total$  = cows * cow$ + chickens * chicken$;
        System.out.println("Total cost of animals in this farm: $"+total$);

    }
}
