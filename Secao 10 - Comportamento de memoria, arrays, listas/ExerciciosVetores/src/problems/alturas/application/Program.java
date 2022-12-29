package problems.alturas.application;

import problems.alturas.entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        Pessoa[] vect = new Pessoa[sc.nextInt()];
        double sumHeights = 0,avg = 0;
        int lessThanSixteen = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Pessoa(name, age, height);
            sumHeights += height;
            if(vect[i].getAge() < 16){
                lessThanSixteen++;
            }
        }
        avg = sumHeights / vect.length;
        System.out.printf("\nAltura media: %.2f\n", avg);
        System.out.println("Pessoas com menos de 16 anos: " + ((double)lessThanSixteen / vect.length) * 100 + "%");
        for (Pessoa pessoa : vect) {
            if (pessoa.getAge() < 16) {
                System.out.println(pessoa.getName());
            }
        }
    }
}
