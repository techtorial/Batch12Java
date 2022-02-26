package primitives;

public class ComparisonOperators {

    public static void main(String[] args) {

        int a = 4, b = 4;

        //==
        boolean result1 = a == b;
        System.out.println(result1);// true
        System.out.println(!result1); // false

        // !=

        boolean result2 = a != b;
        System.out.println(result2);// false

        // > greater than

        boolean result3 = a > b;
        System.out.println(result3); //false

        // < less than

        boolean result4 = a < b;
        System.out.println(result4); //false

        // >=
        boolean result5 = a >= b;
        System.out.println(result5); // true
        // >=
        boolean result6 = a <= b;
        System.out.println(result6); // true

        System.out.println(50 == 50);
        System.out.println('c' > 'd');
        System.out.println(67 != 67);
        System.out.println('c' > 'b');
        System.out.println(true != false); // true



    }
}
