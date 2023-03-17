package Arrays;

import java.util.Scanner;

public class VetoresCalculosDiversos {

    public static void main(String[] args) {

        //Criar um vetor A com 10 elementos inteiros. X
        //Escrever um programa que calcule + escreva: 
        //A) a quantidade de elementos armazenados no vetor que são iguais a 15; e 
        //B) a média dos elementos armazenados no vetor que são superiores a 15.
        int[] listaA = new int[10];

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva os elementos da lista A: ");

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = scan.nextInt(); //adicionamos os elementos
        }

        int elementosValorQuinze = 0;
        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] == 15) {
                elementosValorQuinze++;
            }
        }

        int elementosSuperiorQuinze = 0;
        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] > 15) {
                elementosSuperiorQuinze++;

            }

        }

        System.out.println("Os elementos da lista A que são iguais a 15 são: " + elementosValorQuinze);
        System.out.println("A media dos elementos maiores do que 15 na lista é: " + elementosSuperiorQuinze/listaA.length);

    }

}
