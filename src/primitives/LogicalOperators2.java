package primitives;

public class LogicalOperators2 {
    public static void main(String[] args) {
/*
            you want to bu a new laptop is cost $1200
            you can pay it as cash or credit
            if you have enough cash or enough available credit limit in your cc,
            you can take the laptop home
 */

        double computer$ = 1200;
        double myCash = 1000;
        double myCredit = 300;


        System.out.println( myCash >= computer$ || computer$ <=myCredit );

        boolean buy = computer$ <=myCash || computer$ <=myCredit || myCash + myCredit >= computer$;

        System.out.println("Can I buy the Laptop "+buy);

    }
}
