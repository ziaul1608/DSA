package oops;

public class superKeyword {
    public static class parent {
        int x = 5;
        parent() {
            System.out.println("parent class constructor");
        }
        void show() {
            System.out.println("parent class called");
        }
    }

    public static class child extends parent {
        int x;
        child() {
            System.out.println("child class constructor");
            super();
        }
        void show() {
            System.out.println("value of parent class = " + super.x);
            System.out.println("value of child class = " + x);
            System.out.println("child class called");
            super.show();
        }
    }
    public static void main(String[] args) {
        child obj = new child();
        obj.x = 10;
        obj.show();
    }
}

