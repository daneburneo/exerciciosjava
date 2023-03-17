
package Arrays;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class ArraysRaizQuadrada {

    public static void main(String[] args) {

        // Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
        //mesmo tamanho, sendo que cada elemento do vetor B deverá ser a 
        //raiz quadrada do respectivo elemento de A, ou seja:
        //B[i] = sqrt(A[i]).
        
        int[] listaA = new int[15];
        double[] listaB = new double[15];

        Scanner numero = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui um dos numeros da lista: " + i);
            listaA[i] = numero.nextInt();

            listaB[i] = sqrt(listaA[i]);

        }

        System.out.println();

        for (int i = 0; i < listaA.length; i++) {
            System.out.print(listaA[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < listaB.length; i++) {
            System.out.print(listaB[i] + " ");

        }

    }

}


