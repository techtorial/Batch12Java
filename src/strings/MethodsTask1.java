package strings;

import java.util.Scanner;

public class MethodsTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string value");

        String text= scanner.nextLine();

        System.out.println( text.charAt(0) );; // first character form string

        System.out.println( text.charAt( text.length()-1) );// last char from string

        System.out.println(text.indexOf('c'));// index of first c if it is present in string

        System.out.println(text.indexOf('x'));// index of first x if it is present in string

        // java , happy

        System.out.println(  text.charAt(text.length()/2) );

    }
}
