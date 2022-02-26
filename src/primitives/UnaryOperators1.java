package primitives;

public class UnaryOperators1 {

    public static void main(String[] args) {

        int flower = 12;

        // increment ++ , decrement --
        // pre-increment/decrement
        // post-increment/decrement

        flower++;
        System.out.println(flower);//13

        flower--;
        System.out.println(flower); //12

        System.out.println(flower++);// show 12 --> flower = 13
        System.out.println(flower);// 13
        System.out.println(flower--); // show 13 --> flower = 12
        System.out.println(2 * flower);// 24
        //=====================================
        // flower =12
        System.out.println("*********************");
        ++flower;
        System.out.println(flower);//13

        --flower;
        System.out.println(flower);//12

        System.out.println(++flower);// 13
        System.out.println(++flower);// 14

        System.out.println(--flower);// 13
        System.out.println(flower);// 13

        //========================

        int k = flower++;
        System.out.println("k is " + k);

        System.out.println("k is " + k);
        System.out.println(flower);

        int m = k + ++k; // 13 + 14
        System.out.println("m is " + m);// 27,

        int a = k, b = m, j = a + b++; // a =14 , m = 27, j = 14 + 27 = 41
        // j -->
        System.out.println("j is " + j);//41
        System.out.println("b is " + b);// 28

        char letter = 'd';
        System.out.println(letter); //d

        letter++;
        System.out.println(letter); //
        --letter;
        --letter;
        letter--;
        --letter;
        --letter;
        letter--;
        System.out.println(letter);

        int numberVersionOftheCharacter = letter;
        System.out.println(numberVersionOftheCharacter);

        char assigningNumberToChar = 101;

        System.out.println(++assigningNumberToChar);
        System.out.println(++assigningNumberToChar);

    }

}
