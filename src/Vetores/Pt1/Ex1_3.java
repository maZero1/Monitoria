package Vetores.Pt1;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8]; // Cria um vetor para 8 notas

        System.out.println("Digite 8 notas de alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble(); // Lê a nota
        }

        System.out.println("\nNotas maiores que 7:");
        boolean encontrou = false;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 7.0) {
                System.out.println("Nota: " + notas[i] + " (Aluno " + (i + 1) + ")");
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma nota maior que 7 foi encontrada.");
        }
        scanner.close();
    }
}
