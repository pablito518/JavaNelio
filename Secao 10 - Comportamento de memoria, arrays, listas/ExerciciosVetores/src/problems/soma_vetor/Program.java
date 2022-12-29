package problems.soma_vetor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        double[] vect = new double[sc.nextInt()];
        double sum = 0, avg = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        avg = sum / vect.length;
        System.out.print("\nValores = ");
        for (double value : vect) {
            System.out.print(value + " ");
        }
        System.out.println("\nSoma = " + sum);
        System.out.println("Media = " + avg);
    }
}
