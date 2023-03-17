package Loops;

import java.util.Scanner;

public class NumerosPositivos {

    // Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
    //caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int numerosSomados = 0;

        while (numero >= 0) {

            System.out.println("Insira apenas números positivos(caso queira sair, digite um numero negativo:  ");
            numero = entrada.nextInt();

            numerosSomados = numerosSomados + numero;
            System.out.println("A soma atual dos numeros é:  " + numerosSomados);

        }

        System.out.println("Até logo!");

    }

}
