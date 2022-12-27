package exercicio2.application;

import exercicio2.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);
        System.out.print("\nWhich percentage to increase salary? ");
        employee.IncreaseSalary(sc.nextDouble());
        System.out.println(employee);
        sc.close();
    }
}
