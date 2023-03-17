package Arrays;

import java.util.Scanner;

public class ArrayElementosPares {

    // Criar um vetor A com 10 elementos inteiros. Implementar um programa 
    //que defina e escreva a quantidade de elementos pares
    //neste vetor.
    public static void main(String[] args) {

        int[] listaA = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui os numeros da lista A: ");
            listaA[i] = entrada.nextInt();// aqui os numeros serão adicionados pelo console;

        }

        int elemento = 0; // o elemento 0 será a variável de contador. 
        for (int i = 0; i < listaA.length; i++) { //depois de adicionados os elementos, agora a lista será novamente percorrida.
            if (listaA[i] % 2 == 0) {
                elemento = elemento + 1; // que dá no mesmo que elemento ++ ou elemento += 1
            }

        }

        for (int i = 0; i < listaA.length; i++) {
            System.out.println(listaA[i]); //aqui é outro for para imprimir a lista um por um;

        }

        System.out.println("Quantidade de números pares da lista são: " + elemento);

    }
}
