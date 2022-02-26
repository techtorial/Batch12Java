package primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        // there is an event for kids
        // requirement is >> child has to be 6 years old

        int ageChild = 4;
        int requiredAge = 6;

        boolean canAttend = ageChild == requiredAge;
        System.out.println(canAttend); // false

        // event if the child's age is 6 or more

        boolean canAttend2 = ageChild >= requiredAge;

        System.out.println(canAttend2);// false

        // event for kids if their age is less than 6

        boolean canAttend3 = ageChild < requiredAge;
        System.out.println(canAttend3); // true

        // event for kids, only 6 years old cannot attend
        boolean canAttend4 = ageChild != requiredAge;
        System.out.println(canAttend4);

        int myDistance = 20;

        int limit = 10;

        boolean fee = myDistance >= limit;

        System.out.println(fee);//true




    }
}
