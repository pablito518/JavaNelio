package problems.negativos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

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
