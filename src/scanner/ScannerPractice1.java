package scanner;
import java.util.Scanner;
public class ScannerPractice1 {
    public static void main(String[] args) {

        // you want to take age of user and tell user that s/he was ... years old 10 years ago

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age as a whole number");

        int age = scanner.nextInt();

        System.out.println("your current age is: "+ age);
        System.out.println("Your age was "+ (age - 10)+" 10 years ago");

        // ask user to provide his her height in meters and convert and show it as centimeters
        System.out.println("Please enter your height in meters");

        double height = scanner.nextDouble();

        double heightInCentimeters = height * 100;

        System.out.println("your height in centimeters is: "+ heightInCentimeters);

        // // ask user to provide his/her weight in kilograms
        // calculate users BMI  >> BMI = kg/(m*m)

        System.out.println("Please enter your weight in kilograms");

        double weight = scanner.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("your BMI is "+BMI);




    }
}
