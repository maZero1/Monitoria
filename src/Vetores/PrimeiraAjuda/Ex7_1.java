package Vetores.PrimeiraAjuda;

import java.util.Scanner;

public class Ex7_1 {
    public static  void main(String[]args){
        Scanner s = new Scanner(System.in);
        int [] vetor= new int [5];
        boolean[] numRepetido = new boolean[5];
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Informe um valor");
            vetor[i] = s.nextInt();
            numRepetido[i] = false;
        }
        boolean encontrouRepeticao = false;
        for (int i = 0; i< vetor.length; i++){
            if(numRepetido[i] == true){
                continue;
            }
            int numeroAtual = vetor[i];
            int cont = 0;

            for(int x = 0;x < vetor.length;x++){
                if (vetor[x] == numeroAtual){
                    cont += 1;
                    numRepetido[x] = true;
                }
            }
            if (cont > 1){
                System.out.println("O número: " + numeroAtual + " se repetiu " + cont + " vezes ");
                encontrouRepeticao = true;
            }
        }
        if (!encontrouRepeticao){
            System.out.println("Nenhum número se repetiu");
        }
    }
}
