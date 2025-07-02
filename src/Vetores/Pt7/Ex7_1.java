package Vetores.Pt7;

import java.util.Scanner; // Necessário para ler entrada do usuário

public class Ex7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Vetor para armazenar os 5 números

        // Vetor auxiliar para marcar números que já foram contados
        // Isso evita que um mesmo número repetido seja contado várias vezes
        boolean[] jaContado = new boolean[5];

        System.out.println("Digite 5 números inteiros:");

        // Loop para ler os 5 números do usuário e preencher o vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            jaContado[i] = false; // Inicializa todas as posições como não contadas
        }

        System.out.println("\n--- Números que se repetem e suas contagens ---");
        boolean encontrouRepeticao = false; // Flag para verificar se houve alguma repetição

        // Loop externo: percorre cada número do vetor
        for (int i = 0; i < numeros.length; i++) {
            // Se o número nesta posição já foi contado como parte de uma repetição, pula
            if (jaContado[i] == true) {
                continue; // Avança para a próxima iteração do loop externo
            }

            int numeroAtual = numeros[i]; // Pega o número que estamos analisando
            int contagem = 0; // Inicializa a contagem para o número atual

            // Loop interno: compara o número atual com todos os outros números no vetor
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeroAtual) {
                    contagem++; // Se encontrar uma ocorrência, incrementa a contagem
                    jaContado[j] = true; // Marca esta ocorrência como contada para não processá-la novamente
                }
            }

            // Se a contagem for maior que 1, significa que o número se repetiu
            if (contagem > 1) {
                System.out.println("O número " + numeroAtual + " se repetiu " + contagem + " vezes.");
                encontrouRepeticao = true; // Marca que pelo menos uma repetição foi encontrada
            }
        }

        if (!encontrouRepeticao) {
            System.out.println("Nenhum número se repetiu.");
        }

        scanner.close(); // Fecha o Scanner
    }
}
