package Strings;

public class toggleWithString {
    public static void main(String[] args) {
        String str = "PhYSiCS";
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; //we will use it to check whether char is in Uppercase or Lowercase
            char ch = str.charAt(i);
            if(ch == ' ') continue;

            int ascii = (int)ch;
            if(ascii >= 97) flag = false; // signifies that the char we got is in Lowercase

            if(flag == true) {
                ascii += 32;
                char c1 = (char)ascii;
                str = str.substring(0,i) + c1 + str.substring(i+1);
            } else {
                ascii -= 32;
                char c2 = (char)ascii;
                str = str.substring(0,i) + c2 + str.substring(i+1);
            }
        }

        System.out.println(str);
    }
}
