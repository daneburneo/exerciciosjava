package Arrays;

import java.util.Scanner;

public class ArrayDolar {

    //   Implementar um programa que obtenha a cotação do dólar (U$) em 
//relação ao real (R$) e a seguir armazene em vetor A com 20 
//elementos as seguintes conversões.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorDolar = entrada.nextDouble();

        double[] vetorA = new double[20];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = valorDolar * i; // caso eu quizesse que a posiçao 0 fosse pulada, eu colocaria (i + 1);

        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

    }

}
