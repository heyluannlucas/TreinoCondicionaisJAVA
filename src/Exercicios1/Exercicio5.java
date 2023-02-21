package Exercicios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accountNumber;
        double balance, debit, credit, currentBalance;
        System.out.print("Enter account number: ");
        accountNumber = scan.nextInt();

        System.out.print("Enter initial balance: ");
        balance = scan.nextDouble();

        System.out.print("Enter debit amount: ");
        debit = scan.nextDouble();

        System.out.print("Enter credit amount: ");
        credit = scan.nextDouble();

        currentBalance = balance - debit + credit;

        System.out.println("The current balance of account " + accountNumber + " is $ " + currentBalance);

        if (currentBalance >= 0) {
            System.out.println("Positive balance");
        } else {
            System.out.println("Negative balance");
        }
    }
}
