package problems.soma_vetores;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.*/
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Quantos elementos vai ter cada vetor? ");
        size = sc.nextInt();
        double[] vectA = new double[size];
        double[] vectB = new double[size];
        double[] vectC = new double[size];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < size; i++) {
            vectA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < size; i++) {
            vectB[i] = sc.nextInt();
            vectC[i] = vectA[i] + vectB[i];
        }
        System.out.println("Vetor resultante:");
        for (int i = 0; i < size; i++) {
            System.out.println(vectC[i]);
        }
    }
}
