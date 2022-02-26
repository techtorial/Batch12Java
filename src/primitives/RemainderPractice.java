package primitives;

public class RemainderPractice {
    public static void main(String[] args) {

        /*
         456 ---> 4 + 5 + 6 = 15 --> sout(sum of digits is 15)

         123 --> 1+2+3 = 6
         */

        int number = 122;

        int digit1 = number % 10;
        System.out.println(digit1);
        // updating number by dividing by 10
        number = number /10; // 45

        int digit2 = number%10;
        System.out.println(digit2);

        // updating number by dividing by 10
        number = number/10; //4

        int digit3 = number % 10;
        System.out.println(digit3);// 4

        int sumOfDigits = digit1+digit2+digit3;
        System.out.println(sumOfDigits);


       // 456 % 100 --> 56



    }
}
