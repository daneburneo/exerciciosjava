package Arrays;

import java.util.Scanner;

public class SomaTotalVetores {

    //Criar um vetor A com 10 elementos inteiros. Implementar um programa 
    //que defina e escreva a soma de todos os elementos armazenados 
    //neste vetor
    public static void main(String[] args) {

        int[] listaA = new int[10];

        Scanner numero = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui os numeros que farão parte da listaA:  ");
            listaA[i] = numero.nextInt();                                                         // aqui eu estou dizendo o elemnto da lista vai ser o numero que será digitado pelo usuário.
        }

        int numeros = 0;
        for (int i = 0; i < listaA.length; i++) {
            numeros = numeros + listaA[i];
        }

        for (int i = 0; i < listaA.length; i++) {
            System.out.println(listaA[i]);
        }

        System.out.println("a soma dos numeros da lista A é: " + numeros);

    }

}
