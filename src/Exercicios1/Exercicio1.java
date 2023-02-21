package Exercicios1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number or 'exit' to exit: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int num = Integer.parseInt(input);

            if (num > 0) {
                System.out.println("The number is positive.");
            } else if (num < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}