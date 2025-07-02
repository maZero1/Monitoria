package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String []vetor = new String[4];
        for(int i=0;i<vetor.length;i++){
            System.out.println("Informe um nome");
            vetor[i]=s.nextLine();

        }
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i] + " " + (i+1) + "° Nome");
        }
    }
}
