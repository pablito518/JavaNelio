package problems.maior_posicao;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).*/

        Scanner sc = new Scanner(System.in);
        double higher = 0;
        int higherPos = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        double[] vect = new double[sc.nextInt()];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] > higher){
                higher = vect[i];
                higherPos = i;
            }
        }
        System.out.println("\nMaior valor = " + higher);
        System.out.println("Posicao do maior valor = " + higherPos);
    }
}
