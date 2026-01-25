package oops;

public class singleLevelInheritance {
    public static class parent {
        void print() {
            System.out.println("parent class");
        }
    }
    public static class child extends parent {
        void show() {
            System.out.println("child class");
        }
    }
    public static void main(String[] args) {
        child c = new child();
        c.print();
        c.show();
    }
}

