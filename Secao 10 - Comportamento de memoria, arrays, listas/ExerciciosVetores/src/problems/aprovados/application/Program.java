package problems.aprovados.application;

import problems.aprovados.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis)*/
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
