package primitives;

public class CompoundAssignment {
    public static void main(String[] args) {

        int carNumber = 12;

        // adding 5 more cars to my initial carNumber
        carNumber = carNumber + 5;
        System.out.println(carNumber);// 17

        // adding 5 more cars to my initial carNumber
        carNumber += 5; // --> 22
        System.out.println(carNumber);// --> 22

        carNumber /= 2; // >> carNumber = carNumber / 2;
        System.out.println(carNumber); // 11

        double fee = carNumber * 100; //
        System.out.println(fee);

       fee += (carNumber * 51); // fee = fee + (carNumber * 51)
      // fee *= 1.51;
        System.out.println(fee);

        int number = 21;

        number %= 5; // number = number % 5;
        System.out.println(number); // 1

        fee %= carNumber; // fee = fee % carNumber

        System.out.println(fee);

        number *= (number -= 8);
        System.out.println(number);


    }
}
