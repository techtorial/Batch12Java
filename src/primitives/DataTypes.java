package primitives;

public class DataTypes {

    public static void main(String[] args) {

        byte number  = 127;
        System.out.println(number);// 127
        byte number1 = -13;
        number = number1;
        System.out.println(number); // -13

        System.out.println(number1); // -13

        short number2 = 55;

        short number3 = number;
        System.out.println("This is Number3 --> "+number3);
        number =99;
        int number4 = number;
        System.out.println(number4);// 99

        int number5  = 316535735;
        int number6 = 5;

        float number8 = 3;// 3.0
        float number9 = 2.9f;
        float num1 = number6;
        System.out.println(number6);// 5
        System.out.println(num1); // 5.0

        double d = 5.6d;

        long longNum = 87654321134509l;
        long longNum1 = 1_000_000_000_000_00l;

        System.out.println(Byte.MIN_VALUE); //
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);





    }

}
