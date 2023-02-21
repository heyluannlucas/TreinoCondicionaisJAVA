package Exercicios1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many apples do you want to buy? ");
        int apples = scan.nextInt();

        double cost;
        if (apples < 12) {
            cost = apples * 1.30;
        } else {
            cost = apples * 1.00;
        }

        System.out.println("The total cost of the purchase is R$" + cost);
    }
}