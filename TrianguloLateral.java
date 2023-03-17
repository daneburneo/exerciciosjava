package Loops;

public class TrianguloLateral {

    public static void main(String[] args) {

        int numero = 5;

        for (int i = 1; i <= numero; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= numero; i++) { 
            for(int a = i; a <= numero; a++){
                 System.out.print("* ");
            }
        System.out.println();
        }
    }

}
