package oops;

abstract class parent {
    abstract void show();
    void print() {
        System.out.println("parent class printing");
    }
    parent() {
        System.out.println("parent class constructor");
    }
}

class child1 extends parent {
    void show() {
        System.out.println("child class printing");
    }
    child1() {
        System.out.println("child class constructor");
    }
}

public class abstractionUsingClass {
    public static void main(String[] args) {
        child1 c = new child1();
        c.print();
    }
}
