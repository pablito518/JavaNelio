package application;

import entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); //limpando buffer
        String holder = sc.nextLine();

        Account contaBancaria = new Account(accountNumber, holder);

        System.out.print("Is there na initial deposit (y/n)? ");
        if(sc.nextLine().charAt(0) == 'y'){
            System.out.print("Enter initial deposit value: ");
            contaBancaria.deposit(sc.nextDouble());
        }
        System.out.print("\nAccount data:");
        System.out.println(contaBancaria);

        System.out.print("\nEnter a deposit value: ");
        contaBancaria.deposit(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(contaBancaria);

        System.out.print("\nEnter a withdraw value: ");
        contaBancaria.withdraw(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(contaBancaria);
    }
}
