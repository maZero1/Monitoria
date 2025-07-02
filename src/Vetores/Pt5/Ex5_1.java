package Vetores.Pt5;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        double soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length; // Calcula a média
        System.out.println("\nA média dos números é: " + String.format("%.2f", media));
        scanner.close();
    }
}