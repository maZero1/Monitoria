package Vetores.Pt7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Usa um HashMap para armazenar o número e sua contagem
        Map<Integer, Integer> contagemNumeros = new HashMap<>();

        for (int numero : numeros) {
            // Se o número já está no mapa, incrementa a contagem
            // Se não, adiciona o número com contagem 1
            contagemNumeros.put(numero, contagemNumeros.getOrDefault(numero, 0) + 1);
        }

        System.out.println("\nNúmeros que se repetem e suas contagens:");
        boolean encontrouRepeticao = false;
        for (Map.Entry<Integer, Integer> entry : contagemNumeros.entrySet()) {
            if (entry.getValue() > 1) { // Se a contagem for maior que 1, o número se repete
                System.out.println("Número: " + entry.getKey() + ", Repetições: " + entry.getValue() + " vezes");
                encontrouRepeticao = true;
            }
        }

        if (!encontrouRepeticao) {
            System.out.println("Nenhum número se repetiu.");
        }
        scanner.close();
    }
}
