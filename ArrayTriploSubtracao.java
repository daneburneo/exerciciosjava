package Arrays;

import java.util.Scanner;

public class ArrayTriploSubtracao {

    public static void main(String[] args) {

        //Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
        //um vetor C, onde cada elemento de C é a subtração dos respectivos 
        //elementos em A e B, ou seja:C[i] = A[i] + B[i].
        
        int[] listaA = new int[10];
        int[] listaB = new int[10];
        int[] listaC = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Digite aqui o elemento da lista A: " + i);
            listaA[i] = entrada.nextInt();

        }
        for (int i = 0; i < listaB.length; i++) {
            System.out.println("Digite aqui o elemento da lista B: " + i);
            listaB[i] = entrada.nextInt();

        }
        for (int i = 0; i < listaC.length; i++) {
            listaC[i] = listaA[i] - listaB[i];

        }

        System.out.println();

        for (int i = 0; i < listaA.length; i++) {
            System.out.print(listaA[i]);
        }

        System.out.println();

        for (int i = 0; i < listaB.length; i++) {
            System.out.print(listaB[i]);
        }

        System.out.println();

        for (int i = 0; i < listaC.length; i++) {
            System.out.print(listaC[i]);
        }

    }

}


