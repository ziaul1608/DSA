package oops;

public class hierarchicalInheritance {
    public static class parent {
        void showP() {
            System.out.println("parent class");
        }
    }
    public static class child1 extends parent {
        void showc1() {
            System.out.println("child 1");
        }
    }
    public static class child2 extends parent {
        void showc2() {
            System.out.println("child 2");
        }
    }
    public static void main(String[] args) {
        child1 c1 = new child1();
        child2 c2 = new child2();
        c1.showP();
        c2.showP();
        c1.showc1();
        c2.showc2();
    }
}
