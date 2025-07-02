package Vetores.Pt5;

import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[8];
        double somaIdades = 0;

        System.out.println("Digite 8 idades:");
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            somaIdades += idades[i];
        }

        double mediaIdades = somaIdades / idades.length;
        System.out.println("\nA média das idades é: " + String.format("%.2f", mediaIdades));

        int contAcimaDaMedia = 0;
        System.out.println("Idades acima da média:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > mediaIdades) {
                System.out.println(idades[i]);
                contAcimaDaMedia++;
            }
        }
        System.out.println("Total de idades acima da média: " + contAcimaDaMedia);
        scanner.close();
    }
}
