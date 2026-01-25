package oops;

public class polymorphism {
    public static class operations {

        //compile-time polymorphism
        //-->method overloading
        void add(int a, int b){
            System.out.println("int addition = " + (a+b));
        }

        void add(double a, double b){
            System.out.println("float addition = " + (a+b));
        }

        void add(String a, String b){
            System.out.println("string addition = " + (a+b));
        }
    }

    //run-time polymorphism
    //-->method overriding
    public static class Shape {
        public void area() {
            System.out.println("Displays Area of Shape");
        }
    }
    public static class Triangle extends Shape {
        public void area(int h, int b) {
            System.out.println("Area of Triangle = " + (0.5)*h*b);
        }
    }
    public static class Circle extends Shape {
        public void area(int r) {
            System.out.println( "Area of circle = " + (3.14)*r*r);
        }
    }

    public static void main(String[] args) {

        //compile time polymorphism
        operations op1 = new operations();
        op1.add(20,30);
        op1.add(2.5,3.5);
        op1.add("Md ", "Ziaul");

        //run time polymorphism
        Triangle t = new Triangle();
        t.area();
        t.area(12, 10);
        Circle c = new Circle();
        c.area();
        c.area(2);
    }
}

