package Exercicios1;

import java.util.Scanner;

    public class Exercicio7 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num1, num2;
            System.out.print("Enter the first value: ");
            num1 = input.nextInt();
            System.out.print("Enter the second value: ");
            num2 = input.nextInt();

            if (num1 == num2) {
                System.out.println("Equal numbers");
            } else if (num1 > num2) {
                System.out.println("First is greater");
            } else {
                System.out.println("Second is greater");
            }
        }
    }

