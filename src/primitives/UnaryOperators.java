package primitives;

public class UnaryOperators {
    public static void main(String[] args) {

        int studentNumber = 25;

        System.out.println(studentNumber);// 25

        studentNumber++;
        System.out.println(studentNumber);// 26
        System.out.println(studentNumber++); // shows 26, studentNumber = 27
        System.out.println(studentNumber); // 27


        ++studentNumber;
        System.out.println(studentNumber);// 28
        System.out.println(++studentNumber);// shows 29, studentNumber 29
        System.out.println(studentNumber);


        int a = 5;
        System.out.println(a);
        int i = a++;
        int k = --i + ++a;

        System.out.println("Value of a >> " + a);// 7
        System.out.println("Value of i >> " + i); // 4
        System.out.println("Value of k >> "  + k);

        System.out.println(--k);// 10
        System.out.println(k--);// 10
        System.out.println(k);//9


    }
}
