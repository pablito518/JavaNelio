package problems.aprovados.application;

import problems.aprovados.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        Student[] students = new Student[sc.nextInt()];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "° aluno:");
            sc.nextLine();
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            students[i] = new Student(name, grade1, grade2);
        }
        System.out.println("Alunos aprovados:");
        for (Student student : students) {
            double media = (student.getGrade1() + student.getGrade2()) / 2;
            if (media >= 6) {
                System.out.println(student.getName());
            }
        }
    }
}
