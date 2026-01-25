package oops;

import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            if(b == 0) {
                throw new ArithmeticException("division by zero is not allowed");
            }
            int division = a / b;
            System.out.println("Division = " + division);

        }
        catch (ArithmeticException e) {
            System.out.print("error -> ");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}

