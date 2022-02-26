package primitives;

public class MultipleVariables {



    public static void main(String[] args) {

        // byte, short, int, long, double, float


        byte bt1  = 3;
        byte bt2 = 5;
        byte bt5 = 9;
        // it is possible to create variables on the same/single line if they are sharing the same
        // data type
        byte bt6 = 4, bt7 = 56, bt9;

        double db1 = 2;
        double db3 = 5.6;

        int i1 = 5, i2, i3 =99, i5 =109, i6 = 8;

        int i9; // declaring
        System.out.println("Hi");
        System.out.println(i1);
        System.out.println(db3); // 5.6
        System.out.println(db3+db1); // 7.6
       //  System.out.println(bt9); java: variable bt9 might not have been initialized

    }


}
