package Strings;

public class performance {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        // "" "1" "12" "123" ...
        // poor performance
        System.out.println(str);
    }
}
