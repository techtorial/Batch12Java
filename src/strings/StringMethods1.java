package strings;

public class StringMethods1 {
    public static void main(String[] args) {

        // concat() --> joining string together

        // String is immutable (it does not change the original value unless you reassign it)
        String name = "Jennifer";

        name += " lopez";
        System.out.println(name);


        name.concat(" is not here");

        System.out.println(name.concat("*****")); // Jennifer lopez*****
        System.out.println(name);// Jennifer lopez


        name = name.concat(" !!!!!!");
        System.out.println(name);

        // length() --> it will count and return number(count) of characters in string

        int count = name.length(); // Jennifer lopez !!!!!! --> 21
        System.out.println("There are >>> " + count + " << characters in the string name");
        String animal = "Monkey";

        System.out.println(animal.length()); // 6

        // charAt() --> it will return single character from given string from specific index.

        char letter = animal.charAt(1);// o
        System.out.println(letter);

        // find and show last letter of animal
        System.out.println(animal.charAt(5));// y

        String text = "Would the companies still hire us if our codes are not pretty clean?  :slightly_smiling_face: " +
                "Does it make really big difference with the shorter and longer version?";
        System.out.println(text.charAt(text.length() - 1));


//                    monday  --> letter count = 6 --> text.length()--> 6
//        indexing    012345  --> last index is 5

        //    System.out.println(animal.charAt(11));// StringIndexOutOfBoundsException
        animal = "bamboo";
        int indexOfO = animal.indexOf('o');
        System.out.println(indexOfO);
        int indexOfX = animal.indexOf('x');
        System.out.println(indexOfX);// -1 since there is no 'x in the string (Bamboo)

        System.out.println(animal.indexOf("bo"));
        System.out.println(animal.indexOf("ooo"));

        // indexOf()
        animal = "bamboo";
        System.out.println(animal.indexOf('b')); // --> 0

        int indexOfSecond_b = animal.indexOf('b', 1);
        System.out.println(indexOfSecond_b);// 3

        int indexOfSecond_b1 = animal.indexOf('b', animal.indexOf('b') + 1);// 3
        System.out.println(indexOfSecond_b1);


    }
}
