package strings;

public class StringMethods2 {
    public static void main(String[] args) {

        String quote = "Do whatever it takes";

        // toUpperCase(); toLowerCase(); // returns string

        quote = quote.toLowerCase();
        System.out.println(quote);
        System.out.println("===============");
        quote.toUpperCase();
        System.out.println(quote);
        System.out.println(quote.toUpperCase());
        System.out.println(quote);

        quote = quote.concat(" for your SuccESs");
        quote = quote.toUpperCase();
        System.out.println(quote);

        // starsWith() , endsWith(); returns true or false

        boolean starts = quote.startsWith("do"); // DO WHATEVER IT TAKES FOR YOUR SUCCESS

        System.out.println(starts);// false
        System.out.println(quote.startsWith("IT")); // false

        boolean ends = quote.endsWith("CESS");// true
        System.out.println(ends);
        System.out.println(quote.endsWith("IT TAKES FOR YOUR SUCCESS"));// true
        System.out.println(quote.endsWith("S"));// true

        //contains(); returns true or false

        boolean contain = quote.contains("4");
        System.out.println(contain);// false
        System.out.println(quote.contains("DOWHATEVERITTAKESFORYOURSUCCESS"));// false

    }
}
