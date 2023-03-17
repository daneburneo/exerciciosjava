package Arrays;

import java.util.Scanner;

public class ArraysNumerosMultiplosCinco {

    public static void main(String[] args) {
        
        
       // Criar um vetor A com 10 elementos inteiros. Implementar um programa 
      //que defina e escreva a quantidade de elementos armazenados neste 
      //vetor que são multiplos de 5.

        int[] listaA = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui os numeros da lista A: ");

        listaA[i] = entrada.nextInt();

        }

        int elemento = 0; //o elemento "0" é será itinerado, reunindo o numero de vezes que a condicional será acionada.
        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] % 5 == 0 || listaA[i] % 5 == 5) { //verificador da condicional. Se o elemento da vez da listaA[i] cumprir a condicional, ele será contado como uma volta no elemento.
                elemento = elemento + 1; // isso é igual a elemento += 1, elemento++
            }

        }

        for (int i = 0; i < listaA.length; i++) {
            System.out.println(listaA[i]);

        }

        System.out.println("Quantidade de números na lista que são divisíveis por 5 são: " + elemento);

    }
}
