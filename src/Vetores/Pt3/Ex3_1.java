package Vetores.Pt3;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) { // Começa do último índice e vai até 0
            System.out.println(numeros[i]);
        }
        scanner.close();
    }
}
