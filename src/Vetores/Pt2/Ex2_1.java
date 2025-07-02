package Vetores.Pt2;

public class Ex2_1 {
    public static void main(String[] args) {
        int[] numerosPares = new int[10]; // Vetor para 10 números
        int numeroAtual = 0;

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = numeroAtual; // Armazena o número par
            numeroAtual += 2; // Incrementa para o próximo par
        }

        System.out.println("Os 10 primeiros números pares:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println("Posição " + i + ": " + numerosPares[i]);
        }
    }
}
