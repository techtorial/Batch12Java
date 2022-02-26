package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        /*
        phone $986
        decided to do monthly payments of 100
        find out last months payment and show it
         */
        int phone = 986;
        int mPayment = 100;
        int lastPayment = phone % mPayment;
        System.out.println("You will pay $"+lastPayment+ " on your last bill");
    }
}
