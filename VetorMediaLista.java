package Arrays;

import java.util.Scanner;

public class VetorMediaLista {

//    Criar um vetor A com 10 elementos inteiros. Implementar um programa 
//que defina e escreva a média aritmética simples dos elementos 
//ímpares armazenados neste vetor.
    public static void main(String[] args) {

        int[] listaA = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui os numeros da lista A: ");
            listaA[i] = entrada.nextInt(); // a partir do console, esses números serão adicionados à lista A
        }

        int numero = 0; // uma variável de numero foi criada, para receber a soma do elemento [i] com o numero.
        int listaImpar = 0; // essa variável será usada para itinerar dentro de sí o numero de vezes que um numero ímpar será adicionado. 

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] % 2 != 0) { //

                numero = numero + listaA[i];
                listaImpar++;

            }
        }
        for (int i = 0; i < listaA.length; i++) {
            System.out.println(listaA[i]);

        }
        System.out.println("O valor da média geral dos numeros ímpares da lista é: " + (numero / listaImpar));
    }
}
