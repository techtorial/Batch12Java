package primitives;

public class Remainder1 {
    public static void main(String[] args) {

        /*
        222 --> find the product(to multiply 5 * 2 =10) of digits from given number
         2 * 2 * 2  = 8
         */

        int number=358, firstDigit, secondDigit, thirdDigit;

        firstDigit = number %10;

        number = number /10; //22

        secondDigit = number % 10;

        number = number / 10; //2

        thirdDigit = number %10;

        System.out.println("The product of given number is "+ (firstDigit * secondDigit * thirdDigit));

        int number9 = 20;
        int number10 = 5;

        int rmdr = number9 % number10;
        System.out.println(rmdr);



    }
}
