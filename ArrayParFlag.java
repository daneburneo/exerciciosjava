package Arrays;

import java.util.Scanner;

public class ArrayParFlag {

    public static void main(String[] args) {

        //   Criar um vetor A com 10 elementos inteiros. Desenvolver um programa 
        //que verifique se "todos" os elementos do vetor A são pares. Se pelo 
        //menos um elemento do vetor não for par o processo de repetição para 
        //percorrer os elementos do vetor deve ser encerrado, como sugestão: 
        //utilize uma variável do tipo flag para atingir este propósito
        Scanner entrada = new Scanner(System.in);

        int[] listaA = new int[10];

        for(int i = 0; i < listaA.length; i++){
            System.out.println("Digite aqui o numero para a posição: " + i);
            listaA[i] = entrada.nextInt();

            if (listaA[i] % 2 != 0) {
                break;
            }

        }

    }

}
