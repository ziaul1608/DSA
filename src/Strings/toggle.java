package Strings;

import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        //toggle
        // PhysICS -> pHYSics
//        for (int i = 0; i < str.length(); i++) {
//            boolean flag = true;
//            char ch = str.charAt(i);
//            if(ch == ' ') continue;
//            int ascii = (int)ch;
//            if(ascii >= 97) flag = false;
//            if(flag == true) {
//                ascii += 32;
//                char ch1 = (char)ascii;
//                str.setCharAt(i, ch1);
//            }
//            else {
//                ascii -= 32;
//                char ch2 = (char)ascii;
//                str.setCharAt(i, ch2);
//            }
//        }

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int ascii = (int) ch;
            if(ascii >= 97) flag = false;

            if(flag == true) {
                ascii += 32;
                char ch1 = (char)ascii;
                str.setCharAt(i, ch1);
            } else {
                ascii -= 32;
                char ch2 = (char)ascii;
                str.setCharAt(i, ch2);
            }
        }

        System.out.println(str);
    }
}
