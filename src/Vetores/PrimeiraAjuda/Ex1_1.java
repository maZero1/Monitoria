package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []vetor=new int[5];
        for(int i=0;i<vetor.length;i++){
            System.out.println("Informe um valor");
            vetor[i] = s.nextInt();

        }
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }
}
