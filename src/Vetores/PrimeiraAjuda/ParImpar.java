package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int contImpar = 0;
        int contPar = 0;
        int [][] vetor=new int [2][2];
        for (int lin = 0; lin < vetor.length; lin++) {
            for (int col = 0; col < vetor.length; col++) {
                System.out.println("Informe um valor");
                int vPar = s.nextInt();
                if (vPar % 2 == 0) {
                    contPar += 1;
                } else {
                    contImpar += 1;
                }
                System.out.println("Quantidade pares:" + contPar);
                System.out.println("Quantidade impar:" + contImpar);
            }
        }
        for(int i=0;i< vetor.length;i++){
            for(int x = 0;x < vetor.length;x++){
                System.out.print(vetor[i][x] + " ");
            }
            System.out.println();
        }
    }
}
