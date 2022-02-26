package scanner;


import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        // next()

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter where you live");

        String city = sc.next();// when you use next(), it will only take single word from the user entry, till first space


        System.out.println("I am loosing some part of your city name, please enter again");

       sc = new Scanner(System.in);
      //  sc.nextLine();
        city = sc.nextLine();

        System.out.println("You are living in "+city+" correct?");

        System.out.println("You are living in "+city);

        System.out.println("What is the zipcode");
        int zipcode = sc.nextInt();

        System.out.println("zipcode is "+zipcode);

        // take single character from string
        sc.nextLine();

        System.out.println("Please enter your first name");

        char firstLetter = sc.nextLine().charAt(0);

        System.out.println("your first initial is "+firstLetter);

        System.out.println("Please enter a your name again");

        char secondLetter = sc.nextLine().charAt(1);

        System.out.println("second letter is "+secondLetter);










    }
}
