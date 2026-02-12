package Strings;

public class interning {
    public static void main(String[] args) {
        String s = "Hello";
//        String x = "Hello";
//        x = "Mello";
//        System.out.println(x);
        s = s.substring(0,2) + 'y' + s.substring(3,s.length());
        System.out.println(s);
    }
}
