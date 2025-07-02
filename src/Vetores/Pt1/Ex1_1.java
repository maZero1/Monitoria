package Vetores.Pt1;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Cria um vetor para 5 números inteiros

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Lê o número e armazena no vetor
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); // Mostra cada número do vetor
        }
        scanner.close();
    }
}
