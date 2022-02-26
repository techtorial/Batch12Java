package strings;

public class StringMethods4 {
    public static void main(String[] args) {

        String course = "Java";

        // replace(); it will return String

        course = course.replace('v', '$');

        System.out.println(course); //

        course = "Java";

        System.out.println(course.replace("a", "***"));

        System.out.println(course.replace("Java", "Selenium"));
        course = course.replace("Java", "Selenium !!!!!");
        System.out.println(course);

        course = course.replace("t", "X");

        System.out.println(course);
        course = course.replace("nium !!!!!", "");
        System.out.println(course);
        System.out.println("To many replacement");

        // trim(); it will return string

        String school = " Academy   ";

        System.out.println(school);

        school = school.trim();
        System.out.println(school);
        school = "Tectorial   Academy  ";
        school = school.trim();
        System.out.println(school); // "Tectorial   Academy"


    }
}
