package Exercicios1;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = scan.nextInt();

        System.out.print("Enter the birth year: ");
        int birthYear = scan.nextInt();

        int age = currentYear - birthYear;

        if (age >= 16) {
            System.out.println("You can vote this year.");
        } else {
            System.out.println("You cannot vote this year.");
        }

    }
}
