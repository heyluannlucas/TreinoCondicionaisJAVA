package Exercicios3;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the value of A: ");
        a = input.nextInt();
        System.out.print("Enter the value of B: ");
        b = input.nextInt();
        System.out.print("Enter the value of C: ");
        c = input.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("The values entered form a triangle.");

            if (a == b && b == c) {
                System.out.println("The triangle is equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("The values entered do not form a triangle.");
        }
    }
}
