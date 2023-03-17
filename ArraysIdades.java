package Arrays;

import java.util.Scanner;

public class ArraysIdades {
    // Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. 
    //Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos

    public static void main(String[] args) {

        int[] listaA = new int[10];

        Scanner entrada = new Scanner(System.in);

        int idade = 0;
        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Digite aqui a idade: ");  // caso eu quisesse que a pessoa colocasse o valor da posiçao aqui, eu colocaria o + i.
            listaA[i] = entrada.nextInt();
        }

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] > 35) {
                idade++;

            }
            System.out.println();

        }

        System.out.println(idade + " pessoas têm mais de 35 anos");
    }
}
