package Loops;

public class Quadrado {

    public static void main(String[] args) {

        int numero = 10; //parametro de comparação 

        for (int i = 1; i <= numero; i++) {
            for (int a = 1; a <= numero; a++) {  
                System.out.print("* ");  
            }
            System.out.println();
        }
    }

}
