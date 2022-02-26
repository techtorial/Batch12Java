package strings;

public class StringMethods3 {
    public static void main(String[] args) {
        String device = "microphone";

        // equals() ; it will return true or false

        System.out.println(device.equals("microphone"));// true
        System.out.println(device.equals("MICROPHONE"));
        System.out.println(device.equals("Screen"));
        System.out.println(device.equals(""));

        // equalsIgnoreCase(); it will return true or false
        System.out.println(device.equalsIgnoreCase("MICROPHONE"));
        System.out.println(device.equalsIgnoreCase(" Microphone ")); // false
        System.out.println(device.equalsIgnoreCase("MicRoPhonE"));
        System.out.println(device.equalsIgnoreCase("micro phone"));// false


    }
}
