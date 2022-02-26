package primitives;

public class LogicalOperators1 {
    public static void main(String[] args) {
        /*
        ===Task=====
you are taking three exams from your math class. To be able to pass the Math class;
your average score has to be 60 or more and class average has to be less than your average.
         */
        int exam1 = 40;
        int exam2 = 50;
        int exam3 = 85;
        int myAverage = (exam1 + exam2 + exam3) / 3;
        int requiredScore = 60;
        int classAverage = 55;

        boolean result = myAverage >= requiredScore && classAverage < myAverage;
        System.out.println("Can I pass Math class: " + result);
        System.out.println(myAverage);


    }
}
