package strings;

public class StringBasic {
    public static void main(String[] args) {

        String text = "Techtorial";

        System.out.println(text);

        System.out.println(text + 11);// Techtorial11
        System.out.println(text+ 11 + 8); // Techtorial118
        System.out.println(3+2 +text);// 5Techtorial
        System.out.println(3-2+text);// 1Techtorial
        System.out.println(text+(3-2));//Techtorial1
        System.out.println(text+3*2);// Techtorial6

        System.out.println(text + " Academy"); //

        String word = new String("Academy");
        System.out.println( word );// Academy
        System.out.println( text+ word);// TechtorialAcademy

        text = text + "******";
        System.out.println(text); //Techtorial******
        System.out.println(word);// Academy
        System.out.println(word + true);


        String dayNumber = "2"+3;
        dayNumber += " is tomorrow";
        System.out.println(dayNumber);
        dayNumber += 4;
        System.out.println(dayNumber);

        String something = "";
        System.out.println(something);
        System.out.println("============");
        // reassigning dayNumber as "today is monday"
        dayNumber = "today is monday";
        System.out.println(dayNumber);










    }
}
