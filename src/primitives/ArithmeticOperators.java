package primitives;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num = 9;

        // addition --> +
        int sum = num + 3; // sum --> 12
        System.out.println(sum);

        int num1 = 34;

        // subtraction --> -

        int result = sum - num1; // --> -22
        System.out.println(result);//-22

        double result1 = sum - num;
        System.out.println(result1);//3

        // multiplication --> *

        double multiply = result1 * sum;// 36

        int multiply1 = 5 * 8;
        System.out.println(multiply1); //40

        // division --> /

        int num2 = 12;
        int num3 = 4;

        float division = num2 / num3;
        System.out.println(division); // 3.0

        double division1 = num2 / 2.5;
        System.out.println(division1);
        System.out.println("===================");
        int division3 = 15 / 4 ;
        System.out.println(division3); // 3

        double division4 = 15 / 4 ;
        System.out.println(division4); // 3.75..


        // modulus (remainder) --> % --> find remainder of division problem

        int remainder = 15 % 6;

        System.out.println(remainder);// 3


        int remainder2 = 6 % 4 ;
        System.out.println(remainder2); // 2


        int x =  12, a = 5, b = x+a, k = b / 2;

        System.out.println( k - a ); // 4,3,12,3,3.5,3.5


        int people  =10;

        int burgers = 45;

        int leftOverBurgers = burgers % people;

        System.out.println(leftOverBurgers+ " burgers left over after people shared them evenly");


        char  ch = 'd'; //

        char  ch1 = 'e'; //

        System.out.println(ch); // d
        System.out.println(ch1); // e
        System.out.println( ch + ch1); //

        int chr = ch + ch1;
        System.out.println( chr);

        System.out.println(""+ch+ch1);

    }
}
