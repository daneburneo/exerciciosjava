package Arrays;

import java.util.Scanner;

public class ArrayVetoresTriplosMultiplicacao {
    
    //Criar dois vetores A e B cada um com 10 elementos inteiros. Construir 
    //um vetor C, onde cada elemento de C é a multiplicação dos 
    //respectivos elementos em A e B, ou seja:
   //C[i] = A[i] * B[i

    public static void main(String[] args) {

        int[] listaA = new int[10];
        int[] listaB = new int[10];
        int[] listaC = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) { //criados os elemento de A, que receberá os valores do console.
            System.out.println("Digite aqui o valor de uma das posições da lista A: " + i);
            listaA[i] = entrada.nextInt();

        }

        for (int i = 0; i < listaB.length; i++) { 
            System.out.println("Digite aqui o valor de uma das posições da lista B: " + i);
            listaB[i] = entrada.nextInt(); //elementos de B serão criados aqui com o console.

        }

        for (int i = 0; i < listaC.length; i++) {
            listaC[i] = listaA[i] * listaB[i]; //os elementos de C serão criados de acordo com o pedido da questao...

        }

        System.out.println();

        for (int i = 0; i < listaA.length; i++) {
            System.out.print(listaA[i]); //após a criaçao de todos, eles serão impressos em cada for desses.
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
