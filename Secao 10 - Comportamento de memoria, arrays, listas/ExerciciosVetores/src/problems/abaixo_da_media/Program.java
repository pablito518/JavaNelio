package problems.abaixo_da_media;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        double[] vect = new double[sc.nextInt()];
        double soma = 0,media = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        media = soma / vect.length;
        System.out.printf("\nMedia do vetor = %.3f", media);
        System.out.println("\nElementos abaixo da media:");
        for (double value : vect) {
            if(value < media){
                System.out.printf("%.1f\n",value);
            }
        }
    }
}
