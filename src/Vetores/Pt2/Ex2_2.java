package Vetores.Pt2;

public class Ex2_2 {
    public static void main(String[] args) {
        int[] multiplosDe3 = new int[30]; // Vetor para 30 posições
        int valor = 3; // Começa com o primeiro múltiplo de 3 (3 * 1)

        for (int i = 0; i < multiplosDe3.length; i++) {
            multiplosDe3[i] = valor;
            valor += 3; // Próximo múltiplo de 3
        }

        System.out.println("Vetor preenchido com os 30 primeiros múltiplos de 3:");
        for (int i = 0; i < multiplosDe3.length; i++) {
            System.out.println("Posição " + i + ": " + multiplosDe3[i]);
        }
    }
}
