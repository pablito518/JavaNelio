package problems.numeros_pares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int[] vect = new int[sc.nextInt()];
        int pairs = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("\nNumeros pares:");
        for (int value : vect) {
            if(value % 2 == 0){
                System.out.print(value + " ");
                pairs++;
            }
        }
        System.out.println("\n\nQuantidade de pares = " + pairs);
    }
}
