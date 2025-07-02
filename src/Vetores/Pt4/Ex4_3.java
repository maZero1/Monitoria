package Vetores.Pt4;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[15];
        int somaMaioresQue10 = 0;

        System.out.println("Digite 15 valores inteiros:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
            if (valores[i] > 10) { // Verifica se o valor é maior que 10
                somaMaioresQue10 += valores[i]; // Adiciona à soma
            }
        }

        System.out.println("\nA soma dos valores maiores que 10 é: " + somaMaioresQue10);
        scanner.close();
    }
}
