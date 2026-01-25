package oops;

class Car {
    String name;
    double price;
}

public class oopBasicConcept {
    public static class Student {
        String name;
        int rollNo;
        double marks;

        void print() {

            System.out.println(name);
            System.out.println(rollNo);
            System.out.println(marks);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ziaul";
        s1.rollNo = 100;
        s1.marks = 89.2;

        Student s2 = new Student();
        s2.name = "Yash";
        s2.rollNo = 183;
        s2.marks = 93.5;

        Student s3 = new Student();
        s3.name = "Mayank";
        s3.rollNo = 98;
        s3.marks = 95.5;

        s1.print();
        s2.print();
        s3.print();
    }
}
