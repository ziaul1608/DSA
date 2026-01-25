package oops;

class student {
    String name;
    static String school;

    static void changeSName() {
        school = "Banasthali";
    }

}

public class staticKeyword {
    public static void main(String[] args) {
        student.school = "DAV";
        student.changeSName();
        student s = new student();
        s.name = "Angel";
        System.out.println(s.school);
        System.out.println(s.name);
    }
}

