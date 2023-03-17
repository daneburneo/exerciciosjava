package Arrays;

import java.util.Scanner;

public class ArraysIguais {

    public static void main(String[] args) {

        //crie um vetor A que receba 8 elementos inteiros. 
        //Construa um vetor B de mesmo tipo e tamanho e com os mesmos elementos do vetor A multiplicados por 2
        
        
        int[] listaA = new int[5];
        int[] listaB = new int[5];

        Scanner numero = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui um dos numeros da lista: " + i);
            listaA[i] = numero.nextInt();

            listaB[i] = listaA[i] * 2;

        }
        System.out.println();
        
        for(int i=0; i<listaA.length;i++){
           System.out.print(listaA[i] + " ");
        
        }
        
        System.out.println();
        
        for(int i=0; i<listaB.length;i++){
        System.out.print(listaB[i] + " ");
        }

    }

}
