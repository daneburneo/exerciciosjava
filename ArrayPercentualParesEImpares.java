package Arrays;

import java.util.Scanner;

//Criar um vetor A com 10 elementos inteiros. Desenvolver um programa 
//que defina o percentual de elementos pares e ímpares, 
//respectivamente, armazenados neste vetor

public class ArrayPercentualParesEImpares {

    
    public static void main(String[] args) {

                
        int[] listaA = new int[10];

        Scanner entrada = new Scanner(System.in);
        
        int listaImpar = 0;

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Escreva aqui os numeros da lista A: ");
            listaA[i] = entrada.nextInt(); 
        }

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] % 2 != 0) {
               listaImpar++; // é a mesma coisa que listaImpar = listaImpar + listaA[i];
            }
        }

        int listaPar = listaA.length - listaImpar ;                                                     
        
        double porcentagemPar = (listaPar * 100)/listaA.length;
        double porcentagemImpar = (listaImpar * 100)/listaA.length;
        
        System.out.println("A porcentagem de elementos pares na Lista A é de: " + porcentagemPar + " %");
        System.out.println("A porcentagem de elementos ímpares na Lista A é de " + porcentagemImpar + " %");
    }
}
