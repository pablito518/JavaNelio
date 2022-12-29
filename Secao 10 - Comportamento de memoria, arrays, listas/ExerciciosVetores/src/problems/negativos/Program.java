package problems.negativos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int[] vect = new int[sc.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }
    }
}
