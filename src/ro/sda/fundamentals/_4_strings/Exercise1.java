package ro.sda.fundamentals._4_strings;

public class Exercise1 {
    public static void main(String[] args) {

        String str = "Java Exercise";
        System.out.println("Original String = " + str);

        str.indexOf("e");
        System.out.println("Index of e is " + str.indexOf("e"));

        int idx = str.indexOf("Exer");
        System.out.println("Index of exer is " + idx);

        System.out.println("Character at index 7 is " + str.charAt(7));
        System.out.println("Character at index 4 is " + str.charAt(4));

        char idx8 = str.charAt(8);
        System.out.println("Character at index 8 is " + idx8);
    }
}
