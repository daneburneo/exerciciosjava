package Arrays;

import java.util.Scanner;

public class VetorPalindromo {

    //   Números palíndromos são aqueles que escritos da direita para a 
//esquerda têm o mesmo valor quando escritos da esquerda para a 
//direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um 
//programa que verifique se um dado vetor A de 10 elementos inteiros é 
//um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao 
//último, se o segundo elemento do vetor é igual ao penúltimo e assim 
//por diante até verificar todos os elementos ou chegar a conclusão que 
//o vetor não é um palíndromo.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        boolean palindromo = false;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) { //Ora, a questão aqui são numeros da esquerda para direita. entao o vetor A será -1, e a posiçao i será -1 tambem
                palindromo = false;
                break;

            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);

        }

        if (palindromo) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não Palindromo");
            {
            }

        }
    }

}
