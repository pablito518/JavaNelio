package problems.problem2.application;

import problems.problem2.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); //limpando buffer
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("Average Price = %.2f", avg);
    }
}
