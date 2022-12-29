package problems.mais_velho.application;

import problems.mais_velho.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        Person[] vect = new Person[sc.nextInt()];
        int olderIndex = 0;
        int older = 0;
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Person(name, age);
            if(vect[i].getAge() > older){
                older = age;
                olderIndex = i;
            }
        }
        System.out.println("Pessoas mais velha: " + vect[olderIndex].getName());
    }
}
