package Loops;

public class ArvoreDeNatalCrescente {

    public static void main(String[] args) {

        int numero = 5;
        int numero2 = 2;

        for (int i = 0; i <= numero; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int b = 0; b <= numero2; b++) {
            System.out.println("*");

        }

        System.out.println();

    }
}
