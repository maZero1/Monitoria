package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class Ex6_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] vetor = new int [5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Informe um valor");
            vetor[i] = s.nextInt();
            if(vetor[i] > maior){
                maior = vetor[i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];

            }
        }
        System.out.println("O maior valor é:" + maior);
        System.out.println("O menor valor é:" + menor);
    }
}
