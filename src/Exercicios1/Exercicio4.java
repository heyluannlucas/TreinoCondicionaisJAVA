package Exercicios1;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the first value: ");
        int firstValue = scan.nextInt();

        System.out.print("Now the second one: ");
        int secondValue = scan.nextInt();

        if (firstValue > secondValue) {
            System.out.println("The bigger is " + firstValue);
        } else {
            System.out.println("The smaller is " + secondValue);
        }

    }
}