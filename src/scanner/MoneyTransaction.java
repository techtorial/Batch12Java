package scanner;
import java.util.Scanner;
public class MoneyTransaction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 200;

        System.out.println("Please enter first paycheck amount");

        double firstPay = input.nextDouble();
        System.out.println("Please enter second paycheck amount");
        double secondPay = input.nextDouble();
        System.out.println("Please enter third paycheck amount");
        double thirdPay = input.nextDouble();

        balance = balance + firstPay + secondPay + thirdPay;
        System.out.println(balance);

        System.out.println("what is the phone price");

        double phone$ = input.nextDouble();
        System.out.println("What is the headphone price?");

        double headPhone$ = input.nextDouble();

        balance = balance - (phone$ + headPhone$);

        System.out.println("Your final balance is "+balance);

    }
}
