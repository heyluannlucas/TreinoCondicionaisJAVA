package Exercicios1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, largest1, largest2;
        System.out.print("Enter the first value: ");
        num1 = input.nextInt();
        System.out.print("Enter the second value: ");
        num2 = input.nextInt();
        System.out.print("Enter the third value: ");
        num3 = input.nextInt();

        largest1 = Math.max(num1, Math.max(num2, num3));
        if (largest1 == num1) {
            largest2 = Math.max(num2, num3);
        } else if (largest1 == num2) {
            largest2 = Math.max(num1, num3);
        } else {
            largest2 = Math.max(num1, num2);
        }

        System.out.println("The sum of the two largest values is: " + (largest1 + largest2));
    }
}