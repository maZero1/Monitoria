package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class Ex6_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] vetor = new int [5];
        int maiorT = Integer.MIN_VALUE;
        int menorT = Integer.MAX_VALUE;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        for(int i = 0;i < vetor.length; i++){
            System.out.println("Informe um valor");
            vetor[i] = s.nextInt();
            if(vetor[i] > maiorT){
                maiorT = vetor[i];
                posicaoMaior = i;
            }else if(vetor[i] < menorT){
                menorT = vetor[i];
                posicaoMenor = i;
            }
        }
        System.out.println("A maior temperatura é:" + maiorT + " e sua posição é:" + posicaoMaior);
        System.out.println("A menor temperatura é:" + menorT + " e sua posição é:" + posicaoMenor);
    }
}
