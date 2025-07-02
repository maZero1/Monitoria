package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class Ex5_1 {
    public static void  main(String []args){
        Scanner s = new Scanner(System.in);
        int [] vetor =  new int [3];
        int soma = 0;
        for(int i = 0; i < vetor.length;i++){
            System.out.println("informe um número");
            vetor[i]= s.nextInt();
            soma += vetor[i];
        }
        double media = soma / 3;
        System.out.println("A média é:" + media);
    }
}
