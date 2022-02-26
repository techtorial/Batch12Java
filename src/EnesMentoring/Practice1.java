package EnesMentoring;

public class Practice1 {

    public static void main(String[] args) {

        int TotalMinutes = 4324424;

        int yearsAsAMinutes = 365*24*60;

        int daysAsAMinutes = 24*60;

        int year = TotalMinutes/yearsAsAMinutes;

        int days = (TotalMinutes%yearsAsAMinutes)/daysAsAMinutes;

        System.out.println(TotalMinutes + " is equals " + year+ " years and " + days + " days" );






    }
}
