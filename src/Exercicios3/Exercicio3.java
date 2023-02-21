package Exercicios3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity purchased: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the unit price: ");
        double price = sc.nextDouble();
        double total = quantity * price;
        double discount = 0;

        if (quantity <= 5) {
            discount = total * (2.0 / 100);
        } else if (quantity > 5 && quantity <= 10) {
            discount = total * (3.0 / 100);
        } else if (quantity > 10) {
            discount = total * (5.0 / 100);
        }

        double totalToPay = total - discount;

        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Total to pay: " + totalToPay);
    }
}