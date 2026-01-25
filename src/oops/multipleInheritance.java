package oops;

public class multipleInheritance {
    interface A {
        void showA();
    }
    interface B {
        void showB();
    }
    public static class C implements A, B {

        @Override
        public void showA() {
            System.out.println("class A");
        }

        @Override
        public void showB() {
            System.out.println("class B");
        }
        void showC() {
            System.out.println("class C");
        }
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}

