package Exercicios2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first value: ");
        num1 = input.nextInt();

        do {
            System.out.print("Enter the second value (cannot be zero): ");
            num2 = input.nextInt();
        } while (num2 == 0);

        System.out.println("Division result: " + (num1 / num2));
    }
}
