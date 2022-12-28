package exercicio3.application;

import exercicio3.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.nome = sc.nextLine();

        student.primeiroTrimestre = sc.nextDouble();
        student.segundoTrimestre = sc.nextDouble();
        student.terceiroTrimestre = sc.nextDouble();

        System.out.println(student);
    }
}
