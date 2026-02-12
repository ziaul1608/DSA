package Strings;

public class equals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        // == is comparing the address of the two strings and returning true or false
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        // .equals() is comparing the address first and then if both strings have different address
        // then it moves on to compare each character of both strings and then only it gives the result as true or false
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
