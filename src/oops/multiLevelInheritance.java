package oops;

public class multiLevelInheritance {
    public static class A {
        void showA() {
            System.out.println("A");
        }
    }
    public static class B extends A {
        void showB() {
            System.out.println("B");
        }
    }
    public static class C extends B {
        void showC() {
            System.out.println("C");
        }
    }
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
