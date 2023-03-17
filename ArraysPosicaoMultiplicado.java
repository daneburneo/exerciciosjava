package Arrays;

import java.util.Scanner;

public class ArraysPosicaoMultiplicado {

    public static void main(String[] args) {

        //Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
        //mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá 
        //ser o respectivo elemento de A multiplicado por sua posição (ou 
        //índice), ou seja:
        //B[i] = A[i] * i
        
        int[] listaA = new int[10];
        int[] listaB = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Digite aqui o numero da posição: " + i);
            listaA[i] = entrada.nextInt();

            listaB[i] = listaA[i] * i;

        }

        System.out.println();

        for (int i = 0; i < listaA.length; i++) {
            System.out.print(listaA[i]);
        }

        System.out.println();

        for (int i = 0; i < listaB.length; i++) {
            System.out.print(listaB[i]);
        }

    }

}
