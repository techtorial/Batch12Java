package primitives;

public class LogicalOperators {
    public static void main(String[] args) {

        //  passing a course
        // when your average score is 70% or more AND you attendance is 90% or more

        int requiredAverageScore = 70;
        int requiredAttendance = 90;

        int studentScore = 69;
        int studentAttendance = 100;

        boolean resultOfScore = studentScore >= requiredAverageScore;

        boolean resultOfAttendance = studentAttendance >= requiredAttendance;

        boolean pass = resultOfAttendance && resultOfScore;

        System.out.println("Can student pass: "+ pass);

        boolean pass1 = studentScore >= requiredAverageScore && studentAttendance >= requiredAttendance;
        System.out.println(pass1);

    }

}
