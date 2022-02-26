package strings;

public class SubStringMethod {
    public static void main(String[] args) {

        String item = "flowers are beautiful";

        // substring(); it will return String

        String part = item.substring(3);// >> wers are beautiful
        System.out.println(part);

        String part1 = item.substring(1, 4);
        System.out.println(part1); // low

        // task
        // take part of string starting from 'w' to 't' inclusive and print it

        String part2 = item.substring(item.indexOf('w'), item.indexOf('t') + 1);

        System.out.println(part2);

        // task
        // take part of string starting from 'w' to 'e' (inclusive) which in 'beautiful' and print it

        String part3 = item.substring( item.indexOf('w'), item.indexOf('b')+2);
        System.out.println(part3);
        item = "flowers are beautiful";
        System.out.println(item.substring(2,2));//
        System.out.println("------");
       // System.out.println(item.substring(5,2));

      //  System.out.println(item.substring(2, 55));


    }
}
