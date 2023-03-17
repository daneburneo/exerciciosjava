package Arrays;

import java.util.Scanner;

public class ArrayRamdomico {

    public static void main(String[] args) {

        //Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 
        //0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se 
        //para implementar um programa que determine o percentual de 
        //números 0's e 1's existentes no vetor A.
        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];

        int numero0 = 0;
        int numero1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1); // numeros randomico. Math random é feito para fazer prgramas de numero sorteado.No caso aím quero gerar numeros randomicos até 1. Caso fosse um bingo, iria multiplicar até 100, por exemplo, seria um numero ramdomico até 100.

            if (vetorA[i] == 0) {
                numero0++;
            } else {
                numero1++;
            }

        }
        
        double porcentagemZero = (numero0 * 100)/10;
        double porcentagemUm = (numero1 * 100)/ 10;
        
        System.out.println("A porcentagem zero é igual a " + porcentagemZero);
        System.out.println("A porcentagem um é igual a " + porcentagemUm);

    }

}
