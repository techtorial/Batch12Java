package strings;

import java.util.Scanner;

public class MethodsTask2 {
    public static void main(String[] args) {
        /*
          F - Jenny Brown - 1999
              -check if the input string starts with F
              -check if the input string starts with M
              -check if the input string contains your name
              -check if the input string ending with birth year
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your information as in following format: F - Jenny Brown - 1999 ");

        String data = input.nextLine();

        //-check if the input string starts with F
        System.out.println(data.startsWith("F")); // true/false

        //-check if the input string starts with M
        System.out.println(data.startsWith("M"));// true/false

        // -check if the input string contains your name
        System.out.println(data.contains("David"));

        // -check if the input string ending with birth year
        System.out.println(data.endsWith("1990"));


        // 0 - 9
        System.out.println("*********");
        char lastChar = data.charAt(   data.length() - 1   );




        boolean isDigit = lastChar >= '0' && lastChar <= '9';

        System.out.println(isDigit);// if user enters correct format it always be true
    }
}
