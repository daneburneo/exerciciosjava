package Arrays;

import java.util.Scanner;

public class ArraysPosicaoPar {

    // Criar um vetor A com 10 elementos inteiros. Implementar um programa 
    //que defina e escreva a quantidade de elementos armazenados neste 
    //vetor que são pares.
    
    
    public static void main(String[] args) {

        int[] listaA = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Digite aqui um elemento da lista A: " + i);
            listaA[i] = entrada.nextInt();
        }
        
        System.out.println();

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] % 2 == 0) {

                System.out.println(listaA[i]);

            }

        }

    }

}


