package problems.media_pares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int[] vect = new int[sc.nextInt()];
        int somaPares = 0;
        int qtPares = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0){
                qtPares++;
                somaPares += vect[i];
            }
        }
        System.out.println("Media dos pares = " + ((double) somaPares/qtPares));





    }
}
