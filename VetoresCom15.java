package Arrays;

import java.util.Scanner;

public class VetoresCom15 {

    public static void main(String[] args) {

        //Crie um vetor A com 15 elementos inteiros. Construa um vetor B de mesmo tipo e tamanho
        //sendo que cada elemento do velor B deverá ser o quadrado do respectitvo elemento de A.

        int[] listaA = new int[15];
        int[] listaB = new int[15];

        Scanner numero = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui um dos numeros da lista: " + i);// o "i" é a posição do número contido na lista.
            listaA[i] = numero.nextInt();

            listaB[i] = listaA[i] * listaA[i]; // o elemento de B receberá a mnultiplicação do elemento de A vez4es o proprio elemento de A.

        }
        
        System.out.println();

        for (int i = 0; i < listaA.length; i++) { // como os elementos jaá foram adicionados na lista A pelo scanner, iremos percorrer novamente a listra para printar esses elementos no console
            System.out.print(listaA[i] + " ");

        }
        
        System.out.println();

        for (int i = 0; i < listaB.length; i++) { // da mesma forma, os elementos da lista B foram adicionados pela multiplicação de elementos de A.
            System.out.print(listaB[i] + " ");

        }

    }

}
