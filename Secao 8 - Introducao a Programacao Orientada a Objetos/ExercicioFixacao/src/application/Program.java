package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, quantity;
        System.out.print("What is the dollar price? ");
        price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        quantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.exchange(price, quantity));

        sc.close();
    }
}
