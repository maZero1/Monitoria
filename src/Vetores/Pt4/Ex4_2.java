package Vetores.Pt4;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) { // Verifica se o número é par
                somaPares += numeros[i]; // Adiciona à soma se for par
            }
        }

        System.out.println("\nA soma dos números pares é: " + somaPares);
        scanner.close();
    }
}
