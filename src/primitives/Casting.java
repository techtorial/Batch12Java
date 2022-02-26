package primitives;

public class Casting {
    public static void main(String[] args) {

        // implicit Casting
        short itemNumber = 11;
        int i1 = itemNumber;

        // Explicit casting

        long studentNumber = 245;

        int i2 = (int)studentNumber;
        System.out.println(i2); // 245

        short sh1 = 128;
        byte bt1 = (byte) sh1;

        System.out.println(bt1);

        double tax = 500000000.5;

        int tax1 = (int)tax; // Explicit casting

        System.out.println(tax1); // 5

        // ================
        int tax2 = (short)tax;

        System.out.println(tax2); // 5

        // compound assignment

        studentNumber -= 4;

        tax += studentNumber;

        tax1 += tax;

        tax1 = (int)(tax1 + tax);

        tax1 = (int)tax;


        // create two variables one is "double" data type, other is "float" data type
        // multiply those two variables and store the result into "int" data type

        double number1 = 1.2;
        float number2 = 3.4F;

        System.out.println(number1);

        System.out.println( number1 * number2);

        int result = (int)(number1 * number2);
        System.out.println(result);

        number1 *= number2;
        System.out.println(number1);


        long l = 2;

        int i = (int)l;

        float fl = 2.3f;
        float  fl1  =  3 ;

        float flr = fl+fl1;

        short s1 = 3;
        short s2 = 2;
        short result5 = (short) (s1 + s2);

        int ii = (int)4.9;
        System.out.println(ii+" <<<<<");











    }
}
