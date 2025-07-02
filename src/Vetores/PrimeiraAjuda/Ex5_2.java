package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class Ex5_2 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        int [] vetor =new int [4];
        int contAcima = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Informe os valores");
            vetor[i] = s.nextInt();
            if(vetor[i] >= 10){
                contAcima += 1;
            }

        }
        System.out.println("A quantidade de valores acima da média é:" + contAcima);
    }
}
