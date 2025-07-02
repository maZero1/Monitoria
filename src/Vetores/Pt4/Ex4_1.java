package Vetores.Pt4;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0; // Variável para armazenar a soma

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Adiciona o número lido à soma
        }

        System.out.println("\nA soma total dos números é: " + soma);
        scanner.close();
    }
}
