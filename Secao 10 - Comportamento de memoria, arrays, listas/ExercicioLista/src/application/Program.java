package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" +(i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id,name,salary);
            employeeList.add(employee);
        }
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee e = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(e != null){
            System.out.print("Enter the percentage: ");
            e.increaseSalary(sc.nextDouble());
        }
        else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        sc.close();
    }
}


