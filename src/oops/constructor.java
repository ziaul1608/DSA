package oops;

public class constructor {
    public static class Student {
        String name;
        int age;

        Student() {
            System.out.println("Non-Parameterized constructor called");
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Parameterized constructor called");
            System.out.println("Name = " + name);
            System.out.println("Age = " + age);
        }

        Student(Student s) {
            this.name = s.name;
            this.age = s.age;
            System.out.println("Copy constructor called");
            System.out.println("Name = " + s.name);
            System.out.println("Age = " + s.age);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Angel", 19);
        Student s3 = new Student(s2);
    }
}
