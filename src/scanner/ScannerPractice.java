package scanner;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        String myName = "David";
        System.out.println(myName);

        // creating new scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your last name");


        String lastName =  input.nextLine();// this line is letting user to enter any text value

        System.out.println(lastName);


    }
}
