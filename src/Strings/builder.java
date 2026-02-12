package Strings;

public class builder {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Angel");
//        str.append(" Mishra");
//        System.out.println(str);
//
//        //Mishra -> Misrra
//        //str.setCharAt(9, 'r');
//        str.insert(3,'e');
//        str.deleteCharAt(7);
//        System.out.println(str);
//        str.delete(1,5);
//        System.out.println(str);
//        str.delete(3, 6);
//        System.out.println(str);

        StringBuilder name = new StringBuilder("angel mishra");
        System.out.println(name);
        name.reverse();
        System.out.println(name);
    }
}
