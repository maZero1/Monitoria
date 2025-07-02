package Vetores.Pt6;

import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[10];

        System.out.println("Digite 10 temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double maiorTemp = temperaturas[0];
        int posMaior = 0;
        double menorTemp = temperaturas[0];
        int posMenor = 0;

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maiorTemp) {
                maiorTemp = temperaturas[i];
                posMaior = i;
            }
            if (temperaturas[i] < menorTemp) {
                menorTemp = temperaturas[i];
                posMenor = i;
            }
        }

        System.out.println("\nRelatório de Temperaturas:");
        System.out.println("Maior temperatura: " + maiorTemp + " (Posição no vetor: " + posMaior + ")");
        System.out.println("Menor temperatura: " + menorTemp + " (Posição no vetor: " + posMenor + ")");
        scanner.close();
    }
}
