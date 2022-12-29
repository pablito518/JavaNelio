package problems.dados_pessoas.application;

import problems.dados_pessoas.entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        Person[] people = new Person[sc.nextInt()];
        double taller = 0, smaller, womanAverageHeight = 0;
        int men = 0, women = 0;
        for (int i = 0; i < people.length; i++) {
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            double height = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "º pessoa: ");
            sc.nextLine();
            char gender = sc.nextLine().charAt(0);
            people[i] = new Person(height, gender);
        }
        smaller = people[0].getHeight();
        for (Person person : people) {
            smaller = (person.getHeight() < smaller) ? person.getHeight() : smaller;
            taller = (person.getHeight() > taller) ? person.getHeight() : taller;
            if(person.getGender() == 'M' || person.getGender() == 'm'){
                men++;
            }
            if(person.getGender() == 'F' || person.getGender() == 'f'){
                women++;
                womanAverageHeight += person.getHeight();
            }
        }
        womanAverageHeight /= women;

        System.out.println("Menor altura: " + smaller);
        System.out.println("Maior altura: " + taller);
        System.out.printf("Media das alturas das mulheres = %.2f\n", womanAverageHeight);
        System.out.println("Numero de homens = " + men);
    }
}
