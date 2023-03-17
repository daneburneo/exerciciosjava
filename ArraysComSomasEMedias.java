package Arrays;

import java.util.Scanner;

public class ArraysComSomasEMedias {

    // Criar um vetor A com 10 elementos inteiros. Escrever um programa 
//que calcule e escreva: a) a soma de elementos armazenados neste 
//vetor que são inferiores a 15; b) a quantidade de elementos 
//armazenados no vetor que são iguais a 15; e c) a média dos 
//elementos armazenados no vetor que são superiores a 15.
    public static void main(String[] args) {

        int[] listaA = new int[10];

        Scanner entrada = new Scanner(System.in);

        int somaDeElementos = 0;
        int numero = 0;

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = entrada.nextInt();
            somaDeElementos++;
        }

        for (int i = 0; i < listaA.length; i++) {
            numero = numero + listaA[i];

        }
    }

}


