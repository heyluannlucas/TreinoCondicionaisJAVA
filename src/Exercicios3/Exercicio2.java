package Exercicios3;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code, defaultCode = 1234;
        int password, defaultPassword = 9999;

        System.out.println("Enter the user code:");
        code = scan.nextInt();

        if (code != defaultCode) {
            System.out.println("Invalid user!");
        } else {
            System.out.println("Enter the password:");
            password = scan.nextInt();

            if (password != defaultPassword) {
                System.out.println("Incorrect password");
            } else {
                System.out.println("Access granted");
            }
        }
    }
}