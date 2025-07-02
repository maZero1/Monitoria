package Vetores.Pt1;

import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10]; // Cria um vetor para 10 nomes

        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine(); // Lê o nome e armazena no vetor
        }

        System.out.println("\nLista de Nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i]); // Mostra o nome com índice
        }
        scanner.close();
    }
}
