package Vetores.Pt6;

import java.util.Scanner;

public class Ex6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0]; // Assume o primeiro como maior
        int menor = numeros[0]; // Assume o primeiro como menor

        for (int i = 1; i < numeros.length; i++) { // Começa do segundo elemento
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\nO maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        scanner.close();
    }
}
