package Exercicios2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, negative = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Type the " + (i + 1) + "° value: ");
            valor = input.nextInt();

            if (valor < 0) {
                negative++;
            }
        }

        System.out.println("There were informed " + negative + " negative values.");
    }
}